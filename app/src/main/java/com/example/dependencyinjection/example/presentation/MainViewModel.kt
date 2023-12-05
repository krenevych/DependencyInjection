package com.example.dependencyinjection.example.presentation

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.dependencyinjection.example.domain.UseCase
import javax.inject.Inject

class MainViewModel @Inject constructor (
    private val useCase: UseCase
) {

    fun method() {
        useCase()
    }
}
