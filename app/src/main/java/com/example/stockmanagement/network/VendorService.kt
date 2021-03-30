package com.example.stockmanagement.network

interface VendorService {
}
object VendorApi{
    val retrofitService: VendorService by lazy {
        retrofit.create(VendorService::class.java)
    }
}