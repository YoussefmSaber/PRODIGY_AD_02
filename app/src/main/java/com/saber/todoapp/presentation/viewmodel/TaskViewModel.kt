package com.saber.todoapp.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.saber.todoapp.common.Resource
import com.saber.todoapp.data.data_source.db.Task
import com.saber.todoapp.domain.repository.TaskRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel // Annotation to mark this ViewModel for dependency injection with Hilt
class TaskViewModel @Inject constructor( // Constructor injection for TaskUseCase
    private val taskRepositoryImpl: TaskRepositoryImpl// Use case for task-related operations
) : ViewModel() { // Inherit from ViewModel

    private val _tasks =
        MutableStateFlow<List<Task>>(emptyList()) // Mutable state flow to hold the list of tasks
    val tasks: StateFlow<List<Task>> = _tasks // Public immutable state flow for tasks

    init {
        viewModelScope.launch {
            val task = Task(0, "Test Task", "Description", "High", "Pending", false)
            taskRepositoryImpl.addTask(task)
            val tasks = taskRepositoryImpl.getTasks()
            Log.d("TestViewModel", "Tasks in DB: $tasks")
        }
    }

    fun getTasks() {
        viewModelScope.launch {
            taskRepositoryImpl.getTasks()
                .collect { resource ->
                    when (resource) {
                        is Resource.Success -> {
                            _tasks.value = resource.data ?: emptyList()
                        }

                        is Resource.Error -> {
                            // Log or handle the error
                            Log.e("TaskViewModel", "Error fetching tasks: ${resource.message}")
                        }

                        is Resource.Loading -> {
                            // Optionally handle loading state
                            _tasks.value = emptyList()
                        }
                    }
                }
        }
    }

    // Launch a coroutine in the default dispatcher
    fun addTask(taskModel: Task) {
        viewModelScope.launch {
            taskRepositoryImpl.addTask(taskModel)
                .collect { resource ->
                    when (resource) {
                        is Resource.Success -> {
                            // Optionally log success
                            Log.d(
                                "TaskViewModel",
                                "Task added successfully: ${resource.data}"
                            )
                        }

                        is Resource.Error -> {
                            Log.e("TaskViewModel", "Error adding task: ${resource.message}")
                        }

                        is Resource.Loading -> {
                            // Optionally handle loading state
                        }
                    }
                }
            getTasks() // Fetch updated tasks
        }
    }
}