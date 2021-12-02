package com.example.modernui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {   // bundle : rabet beine activity & Xml
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // ba kelase R be hameye id ha va kelass ha dastresi darim.
    }
}