package com.ludmilla.whatisthenumber.repository

import android.util.Log
import com.ludmilla.whatisthenumber.factory.Network
import com.ludmilla.whatisthenumber.remotesource.RemoteSource

class NumberRepository {

    private val service = Network.createNetworkService<RemoteSource>()

    fun getRandomNumber(){
        service.getRandomNumber()
    }



}