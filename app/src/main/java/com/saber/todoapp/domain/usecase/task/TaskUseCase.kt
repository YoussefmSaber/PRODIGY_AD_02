package com.saber.todoapp.domain.usecase.task

import android.content.res.Resources
import android.net.http.HttpException
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresExtension
import com.saber.todoapp.common.Resource
import com.saber.todoapp.data.data_source.db.Task
import com.saber.todoapp.data.repository.TaskRepository
import com.saber.todoapp.domain.model.TaskModel
import com.saber.todoapp.domain.model.toTask
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.flow
import kotlinx.io.IOException
import javax.inject.Inject

@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
class TaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {

    fun getTasks(): Flow<Resource<List<TaskModel>>> = flow {
        try {
            emit(Resource.Loading())
            val res = taskRepository.getTasks()
            emit(Resource.Success(res))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }

    fun getTaskById(taskId: Long): Flow<Resource<Task>> = flow {
        try {
            emit(Resource.Loading())
            val res = taskRepository.getTaskById(taskId)
            emit(Resource.Success(res!!.toTask()))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }

    fun addTask(task: TaskModel): Flow<Resource<Long>> = flow {
        try {
            emit(Resource.Loading())
            val res = taskRepository.addTask(task)
            emit(Resource.Success(res))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }

    fun updateTask(task: TaskModel): Flow<Resource<Unit>> = flow {
        try {
            emit(Resource.Loading())
            val res = taskRepository.updateTask(task)
            emit(Resource.Success(res))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }

    fun deleteTask(task: TaskModel): Flow<Resource<Unit>> = flow {
        try {
            emit(Resource.Loading())
            val res = taskRepository.deleteTask(task)
            emit(Resource.Success(res))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }
}