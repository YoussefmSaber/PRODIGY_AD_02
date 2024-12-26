package com.saber.todoapp.presentation.screens.tasks

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.saber.todoapp.common.assets.Iconly
import com.saber.todoapp.common.assets.icons.Delete
import com.saber.todoapp.common.assets.icons.`Edit-square`
import com.saber.todoapp.data.data_source.db.Task
import com.saber.todoapp.presentation.componants.CustomOutlinedTextField
import com.saber.todoapp.presentation.componants.GeneralTopBar
import com.saber.todoapp.presentation.componants.PriorityDropDown
import com.saber.todoapp.presentation.componants.StatusDropDown
import com.saber.todoapp.presentation.componants.buttons.auth.IconButton
import com.saber.todoapp.presentation.viewmodel.TaskViewModel
import com.saber.todoapp.ui.theme.AppColors

@Composable
fun TaskDetailsScreen(
    modifier: Modifier = Modifier,
    viewModel: TaskViewModel = hiltViewModel(),
    onBackClick: () -> Unit = {},
    initialTask: Task // Task passed as a parameter
) {
    // Use remember to store the task in mutable state
    var task by remember { mutableStateOf(initialTask) }

    Scaffold(
        containerColor = AppColors.Palette3,
        topBar = {
            GeneralTopBar(title = "Task Details")
        }
    ) { innerPadding ->
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = modifier
                .padding(
                    vertical = innerPadding.calculateTopPadding(),
                    horizontal = 16.dp
                )
                .fillMaxSize()
        ) {
            // Task details
            CustomOutlinedTextField(
                label = "Task Title",
                placeholder = "Enter the task title...",
                icon = null,
                inputValue = task.title,
                onValueChange = { newTitle ->
                    task = task.copy(title = newTitle) // Update the task state when title changes
                }
            )
            CustomOutlinedTextField(
                label = "Task Description",
                placeholder = "Enter the task description...",
                icon = null,
                inputValue = task.description ?: "",
                minLines = 8,
                onValueChange = { newDescription ->
                    task =
                        task.copy(description = newDescription) // Update the task state when description changes
                }
            )
            Text(
                text = "Priority",
                fontSize = 14.sp,
                color = Black,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(start = 8.dp)
            )
            PriorityDropDown(
                modifier = Modifier.fillMaxWidth(),
                defaultValue = task.priority,
                getPriority = { newPriority ->
                    task = task.copy(priority = newPriority) // Update the task's priority
                }
            )
            Text(
                text = "Status",
                fontSize = 14.sp,
                color = Black,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(start = 8.dp)
            )
            StatusDropDown(
                modifier = modifier.fillMaxWidth(),
                defaultValue = task.status,
                getStatus = { newStatus ->
                    task = task.copy(status = newStatus) // Update the task's status
                }
            )
            IconButton(
                text = "Update Task",
                color = AppColors.Palette7,
                icon = Iconly.`Edit-square`,
                onClick = {
                    viewModel.updateTask(task) // Update task in the ViewModel
                    onBackClick() // Navigate back
                }
            )
            IconButton(
                text = "Delete Task",
                color = AppColors.statusPending,
                icon = Iconly.Delete,
                onClick = {
                    viewModel.deleteTask(task) // Update task in the ViewModel
                    onBackClick() // Navigate back
                }
            )
        }
    }
}