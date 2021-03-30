package com.example.stockmanagement.data.models.db.daos

import androidx.room.Dao
import androidx.room.Query
import com.example.stockmanagement.data.models.db.tables.Item

@Dao
interface ItemDao {

    // to get all items.
    @Query("SELECT * FROM item")
    fun getItem(): List<Item>

}