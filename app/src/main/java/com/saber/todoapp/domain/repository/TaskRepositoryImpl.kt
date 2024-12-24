package com.saber.todoapp.domain.repository

import com.saber.todoapp.common.Resource
import com.saber.todoapp.data.data_source.db.Task
import com.saber.todoapp.data.data_source.db.TaskDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class TaskRepositoryImpl @Inject constructor(
    private val taskDao: TaskDao,
) {

    fun getTasks(): Flow<Resource<List<Task>>> = flow {
        try {
            emit(Resource.Loading())
            val tasks = taskDao.getAllTasks()
            emit(Resource.Success(tasks))
        } catch (e: Exception) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        }
    }

    suspend fun getTaskById(taskId: Long): Task? {
        // Example: Fetch task by ID from the database or API
        val res = taskDao.getTaskById(taskId)
        return if (res != null) {
            Task(
                title = res.title,
                description = res.description ?: "",
                priority = res.priority,
                status = res.status,
                isCompleted = res.isCompleted,
                id = res.id
            )
        } else null
    }

    fun addTask(task: Task) = flow {
        try {
            emit(Resource.Loading())
            taskDao.insertTask(task)
            emit(Resource.Success(task))
        } catch (e: Exception) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        }
    }

    suspend fun updateTask(task: Task) {
        // Example: Update task in the database or API
        taskDao.updateTask(task)
    }

    suspend fun deleteTask(task: Task) {
        // Example: Delete task from the database or API
        taskDao.deleteTask(task)
    }
}