package com.example.daggerhiltproject

import android.util.Log

class WiFiManager (private val settings: WiFiSettings) {
    fun connect(){
        settings.openConnection()
    }
    fun sendMessage(){
        settings.writeBytes()
    }
}
class WiFiSettings() {
    fun openConnection(){
        Log.d("MyLog", "Connected")
    }
    fun writeBytes(){
        Log.d("MyLog", "Hola!")
    }
}