package com.example.weatherapp

import com.google.gson.annotations.SerializedName

data class DataFromApi(
    @SerializedName("description")
    val description : String,
)
