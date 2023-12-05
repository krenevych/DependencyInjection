package com.example.dependencyinjection.example.data.local

import javax.inject.Inject

class LocalDataSourceImpl @Inject constructor(
    private val database: Database
) : LocalDataSource {

    override fun method() {
        database.method()
    }
}
