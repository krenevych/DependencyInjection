package com.example.dependencyinjection.example.data.remote

class RemoteDataSourceImpl(
    private val apiService: ApiService
) : RemoteDataSource {

    override fun method() {
        apiService.method()
    }
}
