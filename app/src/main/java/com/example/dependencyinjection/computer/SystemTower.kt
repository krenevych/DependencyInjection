package com.example.dependencyinjection.computer

import javax.inject.Inject

class SystemTower @Inject constructor(
    val memory: Memory,
    val processor: Processor,
    val storage: Storage,
) {
    override fun toString(): String {
        return SystemTower::class.java.toString()
    }
}