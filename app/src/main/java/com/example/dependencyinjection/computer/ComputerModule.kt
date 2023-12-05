package com.example.dependencyinjection.computer

import dagger.Module
import dagger.Provides

@Module
class ComputerModule {

    @Provides
    fun provideComputer(
        systemTower: SystemTower,
        monitor: Monitor,
        keyboard: Keyboard,
        mouse: Mouse,
    ) : Computer {
        return Computer(systemTower, monitor, keyboard, mouse)
    }

    @Provides
    fun provideTower(
        memory: Memory,
        processor: Processor,
        storage: Storage,
    ) : SystemTower {
        return SystemTower(memory, processor, storage)
    }

    @Provides
    fun provideProcessor() : Processor {
        return Processor()
    }
    @Provides
    fun provideMemory() : Memory {
        return Memory()
    }
    @Provides
    fun provideStorage() : Storage {
        return Storage()
    }

}