package com.ludmilla.whatisthenumber.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ludmilla.whatisthenumber.repository.NumberRepository
import kotlinx.coroutines.launch

class NumberRandomViewModel: ViewModel() {
    private val numberRepository: NumberRepository = NumberRepository()

    fun getRandomNumber(){
        viewModelScope.launch {
            numberRepository.getRandomNumber()
        }
    }

}