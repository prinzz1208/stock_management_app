package com.example.stockmanagement.data.api

import com.example.stockmanagement.data.api.dataClasses.requests.LoginRequest
import com.example.stockmanagement.data.api.dataClasses.responses.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {
    @POST("/users/login")
    suspend fun login(@Body() loginRequest: LoginRequest): LoginResponse
}
