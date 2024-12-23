package com.saber.todoapp.data.repository

import com.saber.todoapp.domain.model.TaskModel

interface TaskRepository {
    suspend fun getTasks(): List<TaskModel>
    suspend fun getTaskById(taskId: Long): TaskModel?
    suspend fun addTask(task: TaskModel): Long
    suspend fun updateTask(task: TaskModel)
    suspend fun deleteTask(task: TaskModel)
}