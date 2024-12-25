package com.saber.todoapp.data.data_source.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true) val id: Long,
    var title: String,
    var description: String?,
    var priority: String,
    var status: String,
    val isCompleted: Boolean,
)
