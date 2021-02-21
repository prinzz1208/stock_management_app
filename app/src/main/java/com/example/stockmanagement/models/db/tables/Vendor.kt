package com.example.stockmanagement.models.db.tables

import androidx.room.*

@Entity(tableName = "vendor")
data class Vendor(
  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "vendor_id")
  val vendorId: Long,

  @ColumnInfo(name = "name")
  val name: String,

  @ColumnInfo(name = "address")
  val address: String,

  @ColumnInfo(name = "phone_number")
  val phoneNumber: Int
)

// relationship one-to-many, Vendor with Items.
data class VendorWithItems(
  @Embedded val category: Category,
  @Relation(
    parentColumn = "category_id",
    entityColumn = "item_id"
  )
  val items: List<Item>
)

