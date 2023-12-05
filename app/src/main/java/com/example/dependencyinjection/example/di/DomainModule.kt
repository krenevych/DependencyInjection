package com.example.dependencyinjection.example.di

import com.example.dependencyinjection.example.data.Mapper
import com.example.dependencyinjection.example.data.RepositoryImpl
import com.example.dependencyinjection.example.data.local.LocalDataSource
import com.example.dependencyinjection.example.data.remote.RemoteDataSource
import com.example.dependencyinjection.example.domain.Repository
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    @Provides
    fun provideRepository(
        localDataSource: LocalDataSource,
        remoteDataSource: RemoteDataSource,
        mapper: Mapper

    ) : Repository {
        return RepositoryImpl(
            localDataSource,
            remoteDataSource,
            mapper
        )
    }


}