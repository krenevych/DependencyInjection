package com.example.dependencyinjection.computer

import javax.inject.Inject

class Processor @Inject constructor(){


    override fun toString(): String {
        return Processor::class.java.toString()
    }
}