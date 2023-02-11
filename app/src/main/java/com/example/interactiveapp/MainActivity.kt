package com.example.interactiveapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDark =  findViewById<Button>(R.id.btnDark)
        val btnLight = findViewById<Button>(R.id.btnLight)
        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)

        btnLight.setOnClickListener {
            linearLayout.setBackgroundResource(R.color.yellow)
        }

        btnDark.setOnClickListener {
            linearLayout.setBackgroundResource(R.color.black)
        }
    }
}