package com.example.stockmanagement.models.db.daos

import androidx.room.Dao
import androidx.room.Query
import com.example.stockmanagement.models.db.tables.Category

@Dao
interface CategoryDao {

    // to get all categories.
    @Query("SELECT * FROM category")
    fun getCategories(): List<Category>

}