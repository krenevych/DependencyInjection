package com.example.dependencyinjection.computer

import javax.inject.Inject

class Keyboard @Inject constructor() {


    override fun toString(): String {
        return Keyboard::class.java.toString()
    }
}