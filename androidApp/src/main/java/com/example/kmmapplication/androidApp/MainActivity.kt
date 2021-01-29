package com.example.kmmapplication.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kmmapplication.shared.Greeting
import android.widget.TextView
import com.example.kmmapplication.shared.AnalyticManager
import com.example.kmmapplication.shared.Calculator

fun greet(): String {
    return Greeting().greeting()
}

fun addTwoNumbers(): String {
    return Calculator().addition(4, 6)
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = addTwoNumbers()
        AnalyticManager().initialize("android-appid-123", "android-token-123")
        AnalyticManager().logEvent("App Launched", emptyMap())
    }
}
