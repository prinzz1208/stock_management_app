package com.example.stockmanagement.network


interface ItemService {

}

object ItemApi{
    val retrofitService: ItemService by lazy {
        retrofit.create(ItemService::class.java)
    }
}