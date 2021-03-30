package com.example.stockmanagement.data.models.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.stockmanagement.data.models.db.daos.CategoryDao
import com.example.stockmanagement.data.models.db.daos.ItemDao
import com.example.stockmanagement.data.models.db.daos.VendorDao
import com.example.stockmanagement.data.models.db.tables.Category
import com.example.stockmanagement.data.models.db.tables.Item
import com.example.stockmanagement.data.models.db.tables.Vendor

@Database(entities = [Item::class, Category::class, Vendor::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun itemDao(): ItemDao
    abstract fun categoryDao(): CategoryDao
    abstract fun vendorDao(): VendorDao
}