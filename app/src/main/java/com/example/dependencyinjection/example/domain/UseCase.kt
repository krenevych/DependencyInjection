package com.example.dependencyinjection.example.domain

import javax.inject.Inject

class UseCase @Inject constructor(
    private val repository: Repository
) {

    operator fun invoke() {
        repository.method()
    }
}
