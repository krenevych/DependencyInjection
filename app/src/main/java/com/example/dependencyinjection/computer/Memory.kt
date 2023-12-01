package com.example.dependencyinjection.computer

import javax.inject.Inject

class Memory @Inject constructor(){


    override fun toString(): String {
        return Memory::class.java.toString()
    }
}