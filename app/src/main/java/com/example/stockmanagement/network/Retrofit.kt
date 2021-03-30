package com.example.stockmanagement.network

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "http://10.0.2.2:8000/api/"

 val gson = GsonBuilder()
     .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
     .create()!!

val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create(gson))
    .baseUrl(BASE_URL)
    .build()