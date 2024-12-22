package com.saber.todoapp.data.repository

import com.saber.todoapp.domain.model.TaskModel

interface TaskRepository {
    suspend fun getTasks(): List<TaskModel>
}