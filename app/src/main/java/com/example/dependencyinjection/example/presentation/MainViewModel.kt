package com.example.dependencyinjection.example.presentation

import com.example.dependencyinjection.example.domain.UseCase

class MainViewModel(
    private val useCase: UseCase
) {

    fun method() {
        useCase()
    }
}
