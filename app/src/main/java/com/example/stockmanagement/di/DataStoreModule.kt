package com.example.stockmanagement.di

import android.content.Context
import com.example.stockmanagement.data.models.datastore.UserPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class DataStoreModule {
    @Provides
    fun providesPreferenceStorage(@ApplicationContext context: Context): UserPreferences {
        return UserPreferences(context)
    }
}