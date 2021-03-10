package com.example.stockmanagement.network

import com.example.stockmanagement.network.dataClasses.requests.LoginRequest
import com.example.stockmanagement.network.dataClasses.responses.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface AuthService {
    @POST("/users/login")
    suspend fun login(@Body() loginRequest: LoginRequest): LoginResponse
}

object AuthApi{
    val retrofitService: AuthService by lazy {
        retrofit.create(AuthService::class.java)
    }
}