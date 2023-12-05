package com.example.dependencyinjection.example.data

import com.example.dependencyinjection.example.data.local.LocalDataSource
import com.example.dependencyinjection.example.data.remote.RemoteDataSource
import com.example.dependencyinjection.example.domain.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource,
    private val mapper: Mapper
) : Repository {

    override fun method() {
        mapper.map()
        localDataSource.method()  // Do something with local data
        remoteDataSource.method()  // Do something with remote data
    }
}
