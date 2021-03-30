package com.example.stockmanagement.data.models.db.daos

import androidx.room.Dao
import androidx.room.Query
import com.example.stockmanagement.data.models.db.tables.Vendor

@Dao
interface VendorDao {

    // to get all vendors
    @Query("SELECT * FROM vendor")
    fun getVendors(): List<Vendor>

}