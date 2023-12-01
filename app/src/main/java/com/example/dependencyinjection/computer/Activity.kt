package com.example.dependencyinjection.computer

class Activity {

//    val computer: Computer = Component().createComputer()
    lateinit var computer: Computer
    init {
        Component().inject(this)
    }

}