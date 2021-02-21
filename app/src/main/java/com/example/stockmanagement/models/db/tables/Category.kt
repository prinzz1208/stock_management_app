package com.example.stockmanagement.models.db.tables

import androidx.room.*

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
