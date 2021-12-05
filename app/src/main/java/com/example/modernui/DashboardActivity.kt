package com.example.modernui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatImageButton
import com.example.modernui.databinding.ActivityDashboardBinding
import com.google.android.material.card.MaterialCardView

class DashboardActivity : AppCompatActivity() {
    lateinit var binding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

    /*    setContentView(R.layout.activity_dashboard)
        val backB : AppCompatImageButton = findViewById(R.id.backB)
        val logoutB : AppCompatImageButton = findViewById(R.id.logoutB)
        val layoutCards : MaterialCardView = findViewById(R.id.layoutCards)*/
        showToast("my custom Toast with extention class")

        binding.backB.setOnClickListener {
             Toast.makeText(this,"back Bottom",Toast.LENGTH_LONG).show()
         }

        binding.layoutCards.setOnClickListener {
            Toast.makeText(this,"${getString((R.string.layouts))} clicked.",Toast.LENGTH_LONG).show()
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}