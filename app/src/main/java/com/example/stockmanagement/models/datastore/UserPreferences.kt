package com.example.stockmanagement.models.datastore

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.createDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserPreferences @Inject constructor(
    context: Context
) {
    private val dataStore = context.createDataStore(name = "user_prefs")

    companion object {
        val USER_IS_LOGGED = booleanPreferencesKey("USER_LOGGED")
        val USER_EMAIL = stringPreferencesKey("USER_EMAIL")
        val USER_NAME = stringPreferencesKey("USER_NAME")
        val USER_TOKEN = stringPreferencesKey("USER_TOKEN")
    }

    suspend fun storeUser(userName: String,userEmail:String = "", userLoggedIn:Boolean = false){
        dataStore.edit {
            it[USER_EMAIL] = userEmail
            it[USER_IS_LOGGED] = userLoggedIn
            it[USER_NAME] = userName
        }
    }

    suspend fun storeUserName(userName:String){
        dataStore.edit {
            it[USER_NAME] = userName
        }
    }
    val userNameFlow: Flow<String> = dataStore.data.map {
        it[USER_NAME] ?: ""
    }
    val userEmailFlow: Flow<String> = dataStore.data.map {
        it[USER_EMAIL] ?: ""
    }
    val userIsLoggedInFlow: Flow<Boolean> = dataStore.data.map {
        it[USER_IS_LOGGED] ?: false
    }


}