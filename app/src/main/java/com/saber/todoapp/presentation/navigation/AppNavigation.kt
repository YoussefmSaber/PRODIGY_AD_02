package com.saber.todoapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.saber.todoapp.presentation.screens.tasks.AddEditTaskScreen
import com.saber.todoapp.presentation.screens.tasks.TasksScreen
import com.saber.todoapp.presentation.viewmodel.TaskViewModel

@Composable
fun ApplicationNavigation(navController: NavHostController, viewModel: TaskViewModel) {
    NavHost(navController, startDestination = App) {
        navigation<App>(startDestination = TaskList) {
            composable<TaskList> {
                TasksScreen(
                    viewModel,
                    navigateToTaskDetails = { taskId ->
                        navController.navigate(TaskDetails(taskId))
                    },
                    navigateToAddTask = {
                        navController.navigate(EditTask(-1))
                    })
            }
            composable<TaskDetails> {
                navController.popBackStack()
            }
            composable<Profile> {
                navController.popBackStack()
            }
            composable<EditTask> {
                AddEditTaskScreen()
            }
        }
    }
}