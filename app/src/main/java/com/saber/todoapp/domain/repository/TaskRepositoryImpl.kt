package com.saber.todoapp.domain.repository

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import com.saber.todoapp.data.data_source.db.TaskDao
import com.saber.todoapp.data.repository.TaskRepository
import com.saber.todoapp.domain.model.TaskModel
import com.saber.todoapp.domain.model.toTask
import com.saber.todoapp.utils.NetworkUtils
import dagger.hilt.android.qualifiers.ApplicationContext
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.postgrest.from
import javax.inject.Inject

class TaskRepositoryImpl @Inject constructor(
    private val supabaseClient: SupabaseClient,
    private val taskDao: TaskDao,
    @ApplicationContext private val context: Context
) : TaskRepository {

    override suspend fun getTasks(): List<TaskModel> {
//         Example: Fetch tasks from the database or API
        return if (NetworkUtils.isNetworkAvailable(context)) {
            val taskFromApi = supabaseClient.from("Task").select().decodeList<TaskModel>()
            taskFromApi.map { task ->
                taskDao.insertTask(task.toTask())
            }
            Log.d("TaskRepositoryImpl reciving", "getTasks: $taskFromApi")
            return taskFromApi
        } else {
            taskDao.getAllTasks().map {
                TaskModel(
                    id = "",
                    title = it.title,
                    description = it.description ?: "",
                    priority = "",
                    status = "",
                    isCompleted = false,
                    taskId = it.id
                )
            }
        }
    }

    override suspend fun getTaskById(taskId: Long): TaskModel? {
        // Example: Fetch task by ID from the database or API

        val res = taskDao.getTaskById(taskId)
        return if (res != null) {
            TaskModel(
                id = res.apiId,
                title = res.title,
                description = res.description ?: "",
                priority = res.priority,
                status = res.status,
                isCompleted = res.isCompleted,
                taskId = res.id
            )
        } else null
    }

    override suspend fun addTask(task: TaskModel): Long {
        // Example: Add task to the database or API
        return taskDao.insertTask(task.toTask())
    }

    override suspend fun updateTask(task: TaskModel) {
        // Example: Update task in the database or API
        taskDao.updateTask(task.toTask())
    }

    override suspend fun deleteTask(task: TaskModel) {
        // Example: Delete task from the database or API
        taskDao.deleteTask(task.toTask())
    }

}