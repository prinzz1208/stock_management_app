package com.example.stockmanagement.network

interface CategoryService {

}
object CategoryApi{
    val retrofitService: CategoryService by lazy {
        retrofit.create(CategoryService::class.java)
    }
}