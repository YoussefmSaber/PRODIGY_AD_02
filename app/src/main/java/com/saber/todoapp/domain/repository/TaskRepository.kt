package com.saber.todoapp.domain.repository

import com.saber.todoapp.data.data_source.db.Task

interface TaskRepository {
    suspend fun getAllTasks(): List<Task>

    suspend fun addTask(task: Task): Long

    suspend fun updateTask(task: Task)

    suspend fun deleteTask(task: Task)
}