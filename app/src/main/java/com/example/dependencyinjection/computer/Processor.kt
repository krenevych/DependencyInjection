package com.example.dependencyinjection.computer

import javax.inject.Inject

class Processor{


    override fun toString(): String {
        return Processor::class.java.toString()
    }
}