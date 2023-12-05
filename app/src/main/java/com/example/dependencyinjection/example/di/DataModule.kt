package com.example.dependencyinjection.example.di

import com.example.dependencyinjection.example.data.local.Database
import com.example.dependencyinjection.example.data.local.LocalDataSource
import com.example.dependencyinjection.example.data.local.LocalDataSourceImpl
import com.example.dependencyinjection.example.data.remote.ApiService
import com.example.dependencyinjection.example.data.remote.RemoteDataSource
import com.example.dependencyinjection.example.data.remote.RemoteDataSourceImpl
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideLocalDataSource(database: Database): LocalDataSource {
        return LocalDataSourceImpl(database)
    }

    @Provides
    fun provideRemoteDataSource(apiService: ApiService): RemoteDataSource {
        return RemoteDataSourceImpl(apiService)
    }
}