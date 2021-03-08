package com.example.stockmanagement.network

interface StoreService {
}
object StoreApi{
    val retrofitService: StoreService by lazy {
        retrofit.create(StoreService::class.java)
    }
}