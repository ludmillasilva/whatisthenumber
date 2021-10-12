package com.ludmilla.whatisthenumber.remotesource

import com.ludmilla.whatisthenumber.response.NumberResponse
import retrofit2.http.GET

interface RemoteSource {

    @GET("/rand?min=1&max=300")
    suspend fun getRandomNumber(): NumberResponse
}