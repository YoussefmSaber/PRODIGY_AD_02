package com.saber.todoapp.domain.repository

import com.saber.todoapp.data.data_source.api.AuthApiService
import com.saber.todoapp.data.repository.AuthRepository
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(private val authApiService: AuthApiService) : AuthRepository {
}