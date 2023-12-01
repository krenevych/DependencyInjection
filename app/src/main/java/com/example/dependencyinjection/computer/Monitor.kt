package com.example.dependencyinjection.computer

import javax.inject.Inject

class Monitor @Inject constructor(){


    override fun toString(): String {
        return Monitor::class.java.toString()
    }
}