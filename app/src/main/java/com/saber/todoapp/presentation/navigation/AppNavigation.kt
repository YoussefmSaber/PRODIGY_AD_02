package com.saber.todoapp.presentation.navigation

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.saber.todoapp.common.Constants
import com.saber.todoapp.data.data_source.db.Task
import com.saber.todoapp.presentation.screens.tasks.AddTaskScreen
import com.saber.todoapp.presentation.screens.tasks.TaskDetailsScreen
import com.saber.todoapp.presentation.screens.tasks.TasksScreen

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun ApplicationNavigation(navController: NavHostController) {
    SharedTransitionLayout {
        NavHost(navController, startDestination = App) {
            navigation<App>(startDestination = TaskList) {
                composable<TaskList> {
                    TasksScreen(
                        navigateToTaskDetails = { task ->
                            navController.navigate(
                                TaskDetails(
                                    taskId = task.id,
                                    taskTitle = task.title,
                                    taskDescription = task.description ?: "",
                                    taskPriority = task.priority,
                                    taskStatus = task.status
                                )
                            )
                        },
                        navigateToAddTask = {
                            navController.navigate(AddTask)
                        },
                        animatedContentScope = this
                    )
                }
                composable<TaskDetails> { backStackEntry ->
                    val taskId = backStackEntry.arguments?.getLong("taskId")
                    val taskTitle = backStackEntry.arguments?.getString("taskTitle")
                    val taskDescription = backStackEntry.arguments?.getString("taskDescription")
                    val taskPriority = backStackEntry.arguments?.getString("taskPriority")
                    val taskStatus = backStackEntry.arguments?.getString("taskStatus")

                    if (taskId != null) {
                        TaskDetailsScreen(
                            initialTask = Task(
                                id = taskId,
                                title = taskTitle ?: "",
                                description = taskDescription ?: "",
                                priority = taskPriority ?: "",
                                status = taskStatus ?: "",
                                isCompleted = false
                            ),
                            onBackClick = { navController.popBackStack() }
                        )
                    }
                }
                composable<AddTask> {
                    AddTaskScreen(
                        modifier = Modifier.sharedBounds(
                            sharedContentState = rememberSharedContentState(Constants.ADD_TASK_SCREEN),
                            animatedVisibilityScope = this,
                        ),
                        onBackClick = {
                            navController.popBackStack()
                        }
                    )
                }
            }
        }
    }
}