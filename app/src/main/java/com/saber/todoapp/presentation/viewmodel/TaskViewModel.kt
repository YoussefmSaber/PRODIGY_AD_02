package com.saber.todoapp.presentation.viewmodel

import android.os.Build
import androidx.annotation.RequiresExtension
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.saber.todoapp.common.Resource
import com.saber.todoapp.data.data_source.db.Task
import com.saber.todoapp.domain.model.TaskModel
import com.saber.todoapp.domain.model.toTask
import com.saber.todoapp.domain.usecase.task.TaskUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
@HiltViewModel
class TaskViewModel @Inject constructor(
    private val taskUseCase: TaskUseCase
) : ViewModel() {

    private val _tasks = MutableStateFlow<List<TaskModel>>(emptyList())
    val tasks: StateFlow<List<TaskModel>> = _tasks

    fun getTasks() {
        viewModelScope.launch(Dispatchers.IO) {
            taskUseCase.getTasks()
                .collect { resource ->
                    _tasks.value = resource.data ?: emptyList()
                }
        }
    }

    fun addTask(taskModel: TaskModel) {
        viewModelScope.launch {
            taskUseCase.addTask(taskModel).collect { resource ->
                // Handle task addition result here
            }
        }
    }

    fun deleteTask(taskModel: TaskModel) {
        viewModelScope.launch {
            taskUseCase.deleteTask(taskModel).collect { resource ->
                // Handle task deletion result here
            }
        }
    }
}