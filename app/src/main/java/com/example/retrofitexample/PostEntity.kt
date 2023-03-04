package com.example.retrofitexample

import com.google.gson.annotations.SerializedName

class PostEntity {

    @SerializedName("userId")
    val userId: Int = 0

    @SerializedName("id")
    val id: Int = 0

    @SerializedName("title")
    val title: String = ""

    @SerializedName("body")
    val body: String = ""
}