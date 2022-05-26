package com.example.c7_daggerhilt.data.service

class ApiHelper(private val apiService: ApiService) {
    suspend fun getAllCars() = apiService.getAllCars()
}