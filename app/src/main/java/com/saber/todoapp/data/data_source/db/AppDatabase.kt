package com.saber.todoapp.data.data_source.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Task::class], version = 3, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun taskDao(): TaskDao
}