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

    fun getTaskById(taskId: Long): Flow<Resource<Task>> = flow {
        try {
            emit(Resource.Loading())
            val task = taskDao.getTaskById(taskId)
            emit(Resource.Success(task))
        } catch (e: Exception) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        }
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

    fun updateTask(task: Task) = flow {
        try {
            emit(Resource.Loading())
            taskDao.updateTask(task)
            emit(Resource.Success(task))
        } catch (e: Exception) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        }
    }

    fun deleteTask(task: Task) = flow {
        try {
            emit(Resource.Loading())
            taskDao.deleteTask(task)
            emit(Resource.Success(task))
        } catch (e: Exception) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        }
    }
}