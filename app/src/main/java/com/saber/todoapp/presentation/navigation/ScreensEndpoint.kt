package com.saber.todoapp.presentation.navigation

import com.saber.todoapp.data.data_source.db.Task
import kotlinx.serialization.Serializable

@Serializable // Annotation to make the object serializable
object App // Represents the main application navigation

@Serializable // Annotation to make the data class serializable
data class TaskDetails(
    val taskId: Long,
    val taskTitle: String,
    val taskDescription: String,
    val taskPriority: String,
    val taskStatus: String,
) // Data class to hold task details with a taskId

@Serializable // Annotation to make the data class serializable
object AddTask // Data class to hold task details for editing with a taskId

@Serializable // Annotation to make the object serializable
object TaskList // Represents the task list screen
