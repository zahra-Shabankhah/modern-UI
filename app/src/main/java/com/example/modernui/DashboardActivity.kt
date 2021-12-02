package com.example.modernui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatImageButton

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val backB : AppCompatImageButton = findViewById(R.id.backB)
        val logoutB : AppCompatImageButton = findViewById(R.id.logoutB)
         backB.setOnClickListener {
             Toast.makeText(this,"back Bottom",Toast.LENGTH_LONG).show()
         }

        logoutB.setOnClickListener {
            Toast.makeText(this,"logout Bottom",Toast.LENGTH_LONG).show()
        }
    }
}