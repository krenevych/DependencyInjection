package com.example.dependencyinjection.example.domain

class UseCase(
    private val repository: Repository
) {

    operator fun invoke() {
        repository.method()
    }
}
