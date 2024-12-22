package com.saber.todoapp.domain.repository

import com.saber.todoapp.data.data_source.api.TaskApiService
import com.saber.todoapp.data.data_source.db.TaskDao
import com.saber.todoapp.data.repository.TaskRepository
import javax.inject.Inject

class TaskRepositoryImpl @Inject constructor(
    private val taskApiService: TaskApiService,
    private val taskDao: TaskDao
) : TaskRepository {

    suspend fun getTasks() {

    }

}