package com.saber.todoapp.domain.repository

import com.saber.todoapp.data.data_source.db.TaskDao
import com.saber.todoapp.data.repository.TaskRepository
import com.saber.todoapp.domain.model.TaskModel
import io.github.jan.supabase.SupabaseClient
import javax.inject.Inject

class TaskRepositoryImpl @Inject constructor(
    private val supabaseClient: SupabaseClient,
    private val taskDao: TaskDao
) : TaskRepository {

    override suspend fun getTasks(): List<TaskModel> {
        // Example: Fetch tasks from the database or API
        return taskDao.getAllTasks().map {
            TaskModel(
                id = it.id.toInt(),
                title = it.title,
                description = it.description ?: "",
                isCompleted = false // Example default
            )
        }
    }
}