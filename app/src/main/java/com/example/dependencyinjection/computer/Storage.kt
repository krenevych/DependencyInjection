package com.example.dependencyinjection.computer

import javax.inject.Inject

class Storage @Inject constructor(){


    override fun toString(): String {
        return Storage::class.java.toString()
    }
}