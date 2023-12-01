package com.example.dependencyinjection.computer

class Computer(
    val systemTower: SystemTower,
    val monitor: Monitor,
    val keyboard: Keyboard,
    val mouse: Mouse,
) {

    override fun toString(): String {
        return Computer::class.java.toString()
    }
}