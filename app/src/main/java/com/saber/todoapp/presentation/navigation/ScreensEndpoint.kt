package com.saber.todoapp.presentation.navigation

import kotlinx.serialization.Serializable

@Serializable // Annotation to make the object serializable
object App // Represents the main application navigation

@Serializable // Annotation to make the data class serializable
data class TaskDetails(val taskId: Long) // Data class to hold task details with a taskId

@Serializable // Annotation to make the data class serializable
data class EditTask(val taskId: Long) // Data class to hold task details for editing with a taskId

@Serializable // Annotation to make the object serializable
object TaskList // Represents the task list screen

@Serializable // Annotation to make the object serializable
object Profile // Represents the profile screen