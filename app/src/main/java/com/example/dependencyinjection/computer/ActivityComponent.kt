package com.example.dependencyinjection.computer

import dagger.Component

@Component(modules = [ComputerModule::class, PeripheryModule::class])
interface ActivityComponent {
    fun inject(activity: Activity)

}