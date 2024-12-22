package com.saber.todoapp.di.auth

import com.saber.todoapp.data.data_source.api.AuthApiService
import com.saber.todoapp.data.repository.AuthRepository
import com.saber.todoapp.domain.repository.AuthRepositoryImpl
import com.saber.todoapp.domain.usecase.auth.AuthUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AuthModule {

    @Provides
    @Singleton
    fun provideAuthRepository(authApiService: AuthApiService): AuthRepository {
        return AuthRepositoryImpl(authApiService)
    }

    @Provides
    @Singleton
    fun provideAuthUseCase(authRepository: AuthRepository): AuthUseCase {
        return AuthUseCase(authRepository)
    }
}