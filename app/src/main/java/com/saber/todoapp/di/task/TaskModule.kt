package com.saber.todoapp.di.task

import com.saber.todoapp.data.data_source.db.TaskDao
import com.saber.todoapp.data.repository.TaskRepository
import com.saber.todoapp.domain.repository.TaskRepositoryImpl
import com.saber.todoapp.domain.usecase.task.TaskUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.jan.supabase.SupabaseClient
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TaskModule {

    @Provides
    @Singleton
    fun provideTaskRepository(
        supabaseClient: SupabaseClient,
        taskDao: TaskDao
    ): TaskRepository {
        return TaskRepositoryImpl(supabaseClient, taskDao)
    }

    @Provides
    @Singleton
    fun provideTaskUseCase(taskRepository: TaskRepository): TaskUseCase {
        return TaskUseCase(taskRepository)
    }
}