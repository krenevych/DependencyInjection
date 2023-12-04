package com.example.dependencyinjection.example.data.remote

import android.util.Log

class ApiService{

    fun method() {
        Log.d(TAG, "Api Service")
    }

    companion object {
        const val TAG = "XXXX"
    }
}
