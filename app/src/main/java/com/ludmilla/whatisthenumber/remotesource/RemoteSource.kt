package com.ludmilla.whatisthenumber.remotesource

import com.ludmilla.whatisthenumber.response.NumberResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RemoteSource {

    @GET("/rand")
    fun getRandomNumber(@Query("min") min: Int = 1, @Query("max") max: Int = 300): NumberResponse
}