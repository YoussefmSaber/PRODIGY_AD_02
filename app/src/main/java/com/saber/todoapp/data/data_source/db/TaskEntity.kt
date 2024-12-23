package com.saber.todoapp.data.data_source.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.saber.todoapp.domain.model.TaskModel
import java.util.UUID

@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val apiId: String,
    val title: String,
    val description: String?,
    val priority: String,
    val status: String,
    val isCompleted: Boolean,
    val reminderTime: String?,
    val userId: String
)
