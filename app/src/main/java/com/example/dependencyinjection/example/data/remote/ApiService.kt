package com.example.dependencyinjection.example.data.remote

import android.util.Log
import javax.inject.Inject

class ApiService @Inject constructor() {

    fun method() {
        Log.d(TAG, "Api Service")
    }

    companion object {
        const val TAG = "XXXX"
    }
}
