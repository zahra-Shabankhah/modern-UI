package com.example.modernui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatImageButton
import com.google.android.material.card.MaterialCardView

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val backB : AppCompatImageButton = findViewById(R.id.backB)
        val logoutB : AppCompatImageButton = findViewById(R.id.logoutB)
        val layoutCards : MaterialCardView = findViewById(R.id.layoutCards)

        backB.setOnClickListener {
             Toast.makeText(this,"back Bottom",Toast.LENGTH_LONG).show()
         }

        layoutCards.setOnClickListener {
            Toast.makeText(this,"${getString((R.string.layouts))} clicked.",Toast.LENGTH_LONG).show()
        }

    }
}