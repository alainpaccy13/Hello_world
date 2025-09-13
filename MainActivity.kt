package com.example.helloworld

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Optional: Set text programmatically
        val textView = findViewById<TextView>(R.id.textViewHello)
        textView.text = "Hello World from Kotlin!"
    }
}