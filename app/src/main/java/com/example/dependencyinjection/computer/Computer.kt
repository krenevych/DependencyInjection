package com.example.dependencyinjection.computer

import javax.inject.Inject

class Computer @Inject constructor(
    val systemTower: SystemTower,
    val monitor: Monitor,
    val keyboard: Keyboard,
    val mouse: Mouse,
) {

    override fun toString(): String {
        return Computer::class.java.toString()
    }
}