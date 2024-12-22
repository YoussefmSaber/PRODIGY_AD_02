package com.saber.todoapp.di.data_source

import com.saber.todoapp.BuildConfig
import com.saber.todoapp.data.repository.AuthRepository
import com.saber.todoapp.domain.repository.AuthRepositoryImpl
import com.saber.todoapp.domain.usecase.auth.AuthUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.auth.Auth
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SupabaseModule {

    @Provides
    @Singleton
    fun provideSupabaseClient(): SupabaseClient {
        // Initialize Supabase client (this is just an example)
        return createSupabaseClient(
            supabaseKey = BuildConfig.API_KEY,
            supabaseUrl = BuildConfig.API_URL
        ) {
            install(Auth)
            install(Postgrest)
        }
    }

    @Provides
    @Singleton
    fun provideAuthRepository(supabaseClient: SupabaseClient): AuthRepository {
        return AuthRepositoryImpl(supabaseClient)
    }

    @Provides
    @Singleton
    fun provideAuthUseCase(authRepository: AuthRepository): AuthUseCase {
        return AuthUseCase(authRepository)
    }
}