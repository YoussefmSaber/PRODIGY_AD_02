package com.saber.todoapp.presentation.screens.tasks

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.saber.todoapp.data.data_source.db.Task
import com.saber.todoapp.presentation.componants.CustomOutlinedTextField
import com.saber.todoapp.presentation.componants.GeneralTopBar
import com.saber.todoapp.presentation.componants.PriorityDropDown
import com.saber.todoapp.presentation.componants.StatusDropDown
import com.saber.todoapp.presentation.componants.buttons.auth.IconButton
import com.saber.todoapp.presentation.viewmodel.TaskViewModel
import com.saber.todoapp.ui.theme.AppColors

@Preview
@Composable
fun AddEditTaskScreen(
    modifier: Modifier = Modifier,
    viewModel: TaskViewModel = hiltViewModel(),
    onBackClick: () -> Unit = {}
) {
    val titleText = remember { mutableStateOf("") }
    val descriptionText = remember { mutableStateOf("") }
    val priorityText = remember { mutableStateOf("") }
    val statusText = remember { mutableStateOf("") }

    Scaffold(containerColor = AppColors.Palette2,
        topBar = {
            GeneralTopBar(title = "Add Task")
        }) { innerPadding ->
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = modifier
                .padding(
                    vertical = innerPadding.calculateTopPadding(),
                    horizontal = 16.dp
                )
                .fillMaxSize()
        ) {
            CustomOutlinedTextField(
                label = "Task Title",
                placeholder = "Enter the task title...",
                icon = null,
                inputValue = titleText.value,
                onValueChange = {
                    titleText.value = it
                },
            )
            Spacer(Modifier.height(16.dp))
            CustomOutlinedTextField(
                label = "Task Description",
                placeholder = "Enter the task description...",
                icon = null,
                inputValue = descriptionText.value,
                minLines = 4,
                onValueChange = {
                    descriptionText.value = it
                },
            )
            Spacer(Modifier.height(16.dp))
            PriorityDropDown(
                modifier = Modifier.fillMaxWidth(),
                getPriority = { priority ->
                    priorityText.value = priority
                }
            )
            Spacer(Modifier.height(16.dp))
            StatusDropDown(modifier = Modifier.fillMaxWidth(),
                getStatus = { status ->
                    statusText.value = status
                }
            )
            Spacer(Modifier.height(32.dp))
            IconButton(
                text = "Add task",
                color = AppColors.Palette7,
                onClick = {
                    viewModel.addTask(
                        Task(
                            id = 0,
                            title = titleText.value,
                            description = descriptionText.value,
                            priority = priorityText.value,
                            status = statusText.value,
                            isCompleted = false
                        )
                    )
                    onBackClick()
                }
            )
        }
    }
}