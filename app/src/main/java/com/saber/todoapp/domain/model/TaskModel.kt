package com.saber.todoapp.domain.model

import com.saber.todoapp.data.data_source.db.Task
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TaskModel(
    val id: String,
    val title: String,
    val description: String,
    val priority: String,
    val status: String,
    @SerialName("is_completed")
    val isCompleted: Boolean,
    @SerialName("task_db_id")
    val taskId: Long
)

fun TaskModel.toTask(): Task {
    return Task(
        id = taskId,
        title = this.title,
        description = this.description,
        priority = this.priority,
        status = this.status,
        isCompleted = this.isCompleted,
        reminderTime = null,
        userId = "user_id",
        apiId = this.id
    )
}