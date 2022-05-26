package com.example.c7_daggerhilt.data.model

import com.google.gson.annotations.SerializedName


data class GetAllPostsResponseItem(
    @SerializedName("userId")
    val userId: Int,
    @SerializedName("category")
    val category: String,
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("finishRentAt")
    val finishRentAt: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("price")
    val price: Int,
    @SerializedName("startRentAt")
    val startRentAt: String,
    @SerializedName("status")
    val status: Boolean,
    @SerializedName("updateAt")
    val updatedAt: String
)