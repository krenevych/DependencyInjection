package com.example.dependencyinjection.computer

class Component {

    private fun createComputer() : Computer
    {
        val systemTower = SystemTower(
            Memory(),
            Processor(),
            Storage()
        )
        val monitor = Monitor()
        val keyboard = Keyboard()
        val mouse = Mouse()

        return Computer(systemTower, monitor, keyboard, mouse)
    }

//    fun inject(activity: Activity){
//        activity.computer = createComputer()
//    }


}