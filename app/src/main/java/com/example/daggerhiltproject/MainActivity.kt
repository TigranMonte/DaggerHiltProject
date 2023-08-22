package com.example.daggerhiltproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var wifiManager: WifiManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        инициализация не требуется
//        val settings = WiFiSettings()
//        wifiManager = WifiManager(settings)

        wifiManager.connect()
        wifiManager.sendMessage()
    }
}