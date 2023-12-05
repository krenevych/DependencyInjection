package com.example.dependencyinjection.example.di

import com.example.dependencyinjection.example.presentation.MainActivity
import dagger.Component

@Component(modules = [DomainModule::class, DataModule::class])
interface Component {

    fun inject(activity: MainActivity)
}