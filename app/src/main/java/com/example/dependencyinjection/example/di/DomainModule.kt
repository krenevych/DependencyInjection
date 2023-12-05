package com.example.dependencyinjection.example.di

import com.example.dependencyinjection.example.data.RepositoryImpl
import com.example.dependencyinjection.example.domain.Repository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DomainModule {

    @Binds
    fun provideRepository(repository: RepositoryImpl): Repository

//    @Provides
//    fun provideRepository(repository: RepositoryImpl): Repository {
//        return repository
//    }

}