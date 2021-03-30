package com.example.stockmanagement.data.api.dataClasses.responses

import com.google.gson.annotations.SerializedName

data class LoginResponse (

    @SerializedName("jwt")
    var jwt: String,
    )