package com.example.dependencyinjection.example.di

import com.example.dependencyinjection.example.data.local.LocalDataSource
import com.example.dependencyinjection.example.data.local.LocalDataSourceImpl
import com.example.dependencyinjection.example.data.remote.RemoteDataSource
import com.example.dependencyinjection.example.data.remote.RemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DataModule {

//    @Provides
//    fun provideLocalDataSource(database: Database): LocalDataSource {
//        return LocalDataSourceImpl(database)
//    }
    @Provides
    fun provideLocalDataSource(localDataSourceImpl: LocalDataSourceImpl): LocalDataSource {
        return localDataSourceImpl
    }

//    @Provides
//    fun provideRemoteDataSource(apiService: ApiService): RemoteDataSource {
//        return RemoteDataSourceImpl(apiService)
//    }

    @Provides
    fun provideRemoteDataSource(remoteDataSourceImpl: RemoteDataSourceImpl): RemoteDataSource {
        return remoteDataSourceImpl
    }

//    @Binds
//    fun provideLocalDataSource(localDataSourceImpl: LocalDataSourceImpl): LocalDataSource
//
//    @Binds
//    fun provideRemoteDataSource(remoteDataSourceImpl: RemoteDataSourceImpl): RemoteDataSource
}