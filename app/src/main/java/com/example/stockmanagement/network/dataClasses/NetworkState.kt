package com.example.stockmanagement.network.dataClasses

import okhttp3.ResponseBody

// Sealed class to handle network state.
sealed class NetworkState<out T> {
    data class Success<out T>(val value: T) : NetworkState<T>()
    data class Failure(
        val isNetworkError: Boolean,
        val errorCode: Int?,
        val errorResponse: ResponseBody?
    ) : NetworkState<Nothing>()
}