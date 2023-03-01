package com.example.bmiusingviewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class BmiViewModel: ViewModel() {
    var heightInput by mutableStateOf("")
    var weightInput by mutableStateOf("")

    private var height: Int = 0
        get() {
            return heightInput.toIntOrNull() ?: 0
        }

    private var weight: Int = 0
        get() {
            return weightInput.toIntOrNull() ?: 0
        }

    var bmiResult: Float = 0.0f
        get() {
            var heightInMeters = height / 100.0f
            return if ((weight > 0) && (height > 0)) (weight.toFloat() / heightInMeters / heightInMeters) else 0.0f
        }

    fun changeHeightInput(value: String) {
        heightInput = value
    }

    fun changeWeightInput(value: String) {
        weightInput = value
    }

}