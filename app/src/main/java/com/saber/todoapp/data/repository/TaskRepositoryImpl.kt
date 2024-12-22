package com.saber.todoapp.data.repository

import com.saber.todoapp.data.data_source.db.Task
import com.saber.todoapp.data.data_source.db.TaskDao
import com.saber.todoapp.domain.repository.TaskRepository
import io.github.jan.supabase.SupabaseClient
import javax.inject.Inject

class TaskRepositoryImpl @Inject constructor(
    private val taskDao: TaskDao,
    private val supabaseClient: SupabaseClient
) : TaskRepository {
    override suspend fun getAllTasks(): List<Task> {
        return taskDao.getAllTasks()
    }

    override suspend fun addTask(task: Task): Long {
        return taskDao.insertTask(task)
    }

    override suspend fun updateTask(task: Task) {
        return taskDao.updateTask(task)
    }

    override suspend fun deleteTask(task: Task) {
        return taskDao.deleteTask(task)
    }

}