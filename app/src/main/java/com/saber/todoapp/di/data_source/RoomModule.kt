package com.saber.todoapp.di.data_source

import android.content.Context
import android.util.Log
import androidx.room.Room
import com.saber.todoapp.data.data_source.db.AppDatabase
import com.saber.todoapp.data.data_source.db.TaskDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Provides
    @Singleton
    fun provideTaskDatabase(@ApplicationContext context: Context): AppDatabase {
        Log.d("RoomModule", "Creating database...")
        return Room.databaseBuilder(context, AppDatabase::class.java, "task_database")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideTaskDao(database: AppDatabase): TaskDao {
        Log.d("RoomModule", "Database instance: $database")
        return database.taskDao()
    }
}