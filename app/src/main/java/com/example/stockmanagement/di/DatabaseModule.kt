package com.example.stockmanagement.di

import android.content.Context
import androidx.room.Room
import com.example.stockmanagement.data.models.db.AppDatabase
import com.example.stockmanagement.data.models.db.daos.CategoryDao
import com.example.stockmanagement.data.models.db.daos.ItemDao
import com.example.stockmanagement.data.models.db.daos.VendorDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


// Singleton Component for application scope.
@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {

    // dependency injection for AppDatabase.
    @Provides
    @Singleton
    fun provideAppDatabase( appContext: Context): AppDatabase {
        return Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            "stock"
        ).build()
    }

    // dependency injection for ItemDao.
    @Provides
    fun provideItemDao(appDatabase: AppDatabase): ItemDao {
        return appDatabase.itemDao()
    }

    // dependency injection for CategoryDao.
    @Provides
    fun provideCategoryDao(appDatabase: AppDatabase): CategoryDao {
        return appDatabase.categoryDao()
    }

    // dependency injection for VendorDao.
    @Provides
    fun provideVendorDao(appDatabase: AppDatabase): VendorDao {
        return appDatabase.vendorDao()
    }
}