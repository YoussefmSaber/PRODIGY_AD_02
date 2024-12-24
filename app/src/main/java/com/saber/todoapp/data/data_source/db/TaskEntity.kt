package com.saber.todoapp.data.data_source.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val title: String,
    val description: String?,
    val priority: String,
    val status: String,
    val isCompleted: Boolean,
)
