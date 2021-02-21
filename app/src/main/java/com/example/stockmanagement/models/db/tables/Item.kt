package com.example.stockmanagement.models.db.tables

import androidx.room.*

@Entity(
  foreignKeys = [
    ForeignKey(
      entity = Category::class,
      parentColumns = ["category_id"],
      childColumns = ["item_category_id"],
      onDelete = ForeignKey.RESTRICT, onUpdate = ForeignKey.CASCADE
    ),
    ForeignKey(
      entity = Vendor::class,
      parentColumns = ["vendor_id"],
      childColumns = ["item_vendor_id"],
      onDelete = ForeignKey.RESTRICT, onUpdate = ForeignKey.CASCADE
    )
  ]
)
data class Item(
  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "item_id")
  val itemId: Long,

  @ColumnInfo(name = "name")
  val name: String,

  @ColumnInfo(name = "count")
  val count: Int,

  @ColumnInfo(name = "price")
  val price: Int,

  @ColumnInfo(name = "item_category_id")
  val itemCategoryId: Long,

  @ColumnInfo(name = "item_vendor_id")
  val vendorId: Long

)

// relationship one-to-one, Item And Category.
data class ItemAndCategory(
  @Embedded val category: Category,
  @Relation(
    parentColumn = "category_id",
    entityColumn = "item_category_id"
  )
  val item: Item

)

// relationship one-to-one, Item And Vendor.
data class ItemAndVendor(
  @Embedded val vendor: Vendor,
  @Relation(
    parentColumn = "vendor_id",
    entityColumn = "item_vendor_id"
  )
  val item: Item
)

