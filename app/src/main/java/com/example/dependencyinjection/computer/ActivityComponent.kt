package com.example.dependencyinjection.computer

import dagger.Component

@Component
interface ActivityComponent {
    fun inject(activity: Activity)

}