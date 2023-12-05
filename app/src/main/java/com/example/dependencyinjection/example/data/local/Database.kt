package com.example.dependencyinjection.example.data.local

import android.util.Log
import javax.inject.Inject

class Database @Inject constructor() {

    fun method() {
        Log.d(TAG, "DataBase")

    }

    companion object {
        const val TAG = "XXXX"
    }
}
