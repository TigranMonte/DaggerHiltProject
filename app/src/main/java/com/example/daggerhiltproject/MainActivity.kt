package com.example.daggerhiltproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var wifiManager: WifiManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val settings = WiFiSettings()
        wifiManager = WifiManager(settings)

        wifiManager.connect()
        wifiManager.sendMessage()
    }
}