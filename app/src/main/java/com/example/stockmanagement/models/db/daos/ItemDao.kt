package com.example.stockmanagement.models.db.daos

import androidx.room.Dao
import androidx.room.Query
import com.example.stockmanagement.models.db.tables.Item

@Dao
interface ItemDao {

    // to get all items.
    @Query("SELECT * FROM item")
    fun getItem(): List<Item>

}