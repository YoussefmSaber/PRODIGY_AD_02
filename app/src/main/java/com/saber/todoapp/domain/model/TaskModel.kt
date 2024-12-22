package com.saber.todoapp.domain.model

data class TaskModel(
    val id: Int,
    val title: String,
    val description: String,
    val isCompleted: Boolean
)