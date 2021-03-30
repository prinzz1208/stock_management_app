package com.example.stockmanagement.network.dataClasses.responses

import com.example.stockmanagement.models.dataClasses.User
import com.google.gson.annotations.SerializedName

data class LoginResponse (

    @SerializedName("jwt")
    var jwt: String,
    )