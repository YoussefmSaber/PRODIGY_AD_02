package com.saber.todoapp.domain.repository

import com.saber.todoapp.data.repository.AuthRepository
import com.saber.todoapp.domain.model.AuthSession
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.auth.auth
import io.github.jan.supabase.auth.providers.builtin.Email
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val authApiService: SupabaseClient
) : AuthRepository {
    // Add your methods here
    override suspend fun authenticate(username: String, password: String): AuthSession {
//        return authApiService.auth.signInWith(
//            provider =
//        )
        TODO()
    }
}