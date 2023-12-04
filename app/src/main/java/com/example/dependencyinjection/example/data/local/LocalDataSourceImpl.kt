package com.example.dependencyinjection.example.data.local

class LocalDataSourceImpl(
    private val database: Database
) : LocalDataSource {

    override fun method() {
        database.method()
    }
}
