package com.saber.todoapp.presentation.screens.tasks

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.saber.todoapp.data.data_source.db.Task
import com.saber.todoapp.presentation.componants.GeneralTopBar
import com.saber.todoapp.presentation.componants.TodoItem
import com.saber.todoapp.presentation.viewmodel.TaskViewModel
import com.saber.todoapp.ui.theme.AppColors

@Composable
fun TasksScreen(
    viewModel: TaskViewModel,
    navigateToTaskDetails: (Long) -> Unit = {},
    navigateToAddTask: () -> Unit = {}
) {
    viewModel.getTasks()
    val task = viewModel.tasks.collectAsState()
    Scaffold(
        containerColor = AppColors.background,
        topBar = {
            GeneralTopBar(
                title = "To-Do App",
                isLogoutIcon = false
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                containerColor = AppColors.Palette2,
                onClick = navigateToAddTask
            ) {
                Icon(
                    imageVector = Icons.Outlined.Add,
                    contentDescription = "Added new Task",
                    tint = Color.White
                )
            }
        }
    ) { innerPadding ->
        Column(Modifier.padding(innerPadding)) {

            Spacer(Modifier.height(16.dp))
            Box(Modifier.padding(horizontal = 16.dp)) {
                LazyColumn {
                    items(task.value) {
                        TodoItem(
                            task = it,
                            navigateToTaskDetails = navigateToTaskDetails
                        )
                        Spacer(Modifier.height(16.dp))
                    }
                }
            }
        }
    }
}