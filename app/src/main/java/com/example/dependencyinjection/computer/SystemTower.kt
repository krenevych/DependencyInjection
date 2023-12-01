package com.example.dependencyinjection.computer

class SystemTower(
    val memory: Memory,
    val processor: Processor,
    val storage: Storage,
) {
    override fun toString(): String {
        return SystemTower::class.java.toString()
    }
}