package com.example.dependencyinjection.computer

import javax.inject.Inject

class Activity {

//    val computer: Computer = Component().createComputer()
//    lateinit var computer: Computer
//    init {
//        Component().inject(this)
//    }

//    val keyboard: Keyboard = DaggerActivityComponent.create().createKeyboard()
    @Inject
    lateinit var keyboard: Keyboard

    @Inject lateinit var computer: Computer

    init {
        DaggerActivityComponent.create().inject(this)
    }

}