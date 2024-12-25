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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
    val priorityText = remember { mutableStateOf("Low") }
    val statusText = remember { mutableStateOf("In Progress") }

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
            Text(
                text = "Priority",
                fontSize = 14.sp,
                color = Black,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(start = 8.dp)
            )

            PriorityDropDown(
                modifier = Modifier.fillMaxWidth(),
                getPriority = { priority ->
                    priorityText.value = priority
                }
            )
            Text(
                text = "Status",
                fontSize = 14.sp,
                color = Black,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(start = 8.dp)
            )
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