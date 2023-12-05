package com.example.dependencyinjection.computer

import dagger.Module
import dagger.Provides

@Module
class PeripheryModule {

    @Provides
    fun provideKeyboard() : Keyboard {
        return Keyboard()
    }
    @Provides
    fun provideMouse() : Mouse {
        return Mouse()
    }

    @Provides
    fun provideMonitor() : Monitor {
        return Monitor()
    }

}