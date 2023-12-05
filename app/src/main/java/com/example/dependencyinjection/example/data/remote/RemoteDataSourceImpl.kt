package com.example.dependencyinjection.example.data.remote

import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(
    private val apiService: ApiService
) : RemoteDataSource {

    override fun method() {
        apiService.method()
    }
}
