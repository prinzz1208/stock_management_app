package com.example.stockmanagement.data.models.db.tables

import androidx.room.*
import androidx.room.Entity

@Entity(tableName = "category")
data class Category(
  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "category_id")
  val categoryId: Long,

  @ColumnInfo(name = "name")
  val name: String,
)

// relationship one-to-many, Category with Items.
data class CategoryWithItems(
  @Embedded val category: Category,
  @Relation(
    parentColumn = "category_id",
    entityColumn = "item_id"
  )
  val items: List<Item>
)
