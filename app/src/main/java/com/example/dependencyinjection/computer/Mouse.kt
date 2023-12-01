package com.example.dependencyinjection.computer

import javax.inject.Inject

class Mouse @Inject constructor(){


    override fun toString(): String {
        return Mouse::class.java.toString()
    }
}