package com.example.daggerhiltproject

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WifiManager @Inject constructor(private val settings: WiFiSettings) {
    fun connect(){
        settings.openConnection()
    }
    fun sendMessage(){
        settings.writeBytes()
    }
}
class WiFiSettings @Inject constructor() {
    fun openConnection(){
        Log.d("MyLog", "Connected")
    }
    fun writeBytes(){
        Log.d("MyLog", "Hola!")
    }
}