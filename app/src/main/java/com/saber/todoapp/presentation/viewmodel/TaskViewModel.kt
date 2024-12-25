package com.saber.todoapp.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.saber.todoapp.common.Constants.EMPTY_TASK
import com.saber.todoapp.common.Resource
import com.saber.todoapp.data.data_source.db.Task
import com.saber.todoapp.domain.repository.TaskRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class TaskViewModel @Inject constructor(
    private val taskRepositoryImpl: TaskRepositoryImpl
) : ViewModel() {

    private val _tasks = MutableStateFlow<List<Task>>(emptyList())
    val tasks: StateFlow<List<Task>> = _tasks

    private val _task = MutableStateFlow<Task>(EMPTY_TASK)
    val task: StateFlow<Task> = _task

    init {
        fetchInitialData()
    }

    private fun fetchInitialData() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                refreshTasks()
            }
        }
    }

    fun getTasks() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                taskRepositoryImpl.getTasks()
                    .collect { handleResource(it) { data -> _tasks.value = data ?: emptyList() } }
            }
        }
    }

    fun addTask(taskModel: Task) {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                taskRepositoryImpl.addTask(taskModel).collect { handleResource(it) }
                refreshTasks()
            }
        }
    }

    fun getTaskById(taskId: Long) {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                taskRepositoryImpl.getTaskById(taskId)
                    .collect { handleResource(it) { data -> _task.value = data ?: EMPTY_TASK } }
            }
        }
    }

    fun updateTask(task: Task) {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                taskRepositoryImpl.updateTask(task).collect { resource ->
                    handleResource(resource) {
                        if (resource is Resource.Success) {
                            _task.value = task // Update the current task
                        }
                    }
                }
                refreshTasks()
            }
        }
    }


    fun deleteTask(task: Task) {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                taskRepositoryImpl.deleteTask(task).collect { handleResource(it) }
                refreshTasks()
            }
        }
    }

    private suspend fun refreshTasks() {
        taskRepositoryImpl.getTasks()
            .collect { handleResource(it) { data -> _tasks.value = data ?: emptyList() } }
    }

    private inline fun <T> handleResource(resource: Resource<T>, onSuccess: (T?) -> Unit = {}) {
        when (resource) {
            is Resource.Success -> {
                onSuccess(resource.data)
                Log.d("TaskViewModel", "Operation successful: ${resource.data}")
            }

            is Resource.Error -> {
                Log.e("TaskViewModel", "Operation failed: ${resource.message}")
            }

            is Resource.Loading -> {
                Log.d("TaskViewModel", "Loading...")
            }
        }
    }
}
