package com.example.dependencyinjection.example.data

import android.util.Log
import javax.inject.Inject

class Mapper @Inject constructor(){

    fun map() {
        Log.d(TAG, "map data")
    }

    companion object {
        const val TAG = "XXXX"
    }
}
