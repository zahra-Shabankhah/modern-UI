package com.example.modernui

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.modernui.databinding.ActivityIntentForResultExampleBinding

class IntentForResultExampleActivity : AppCompatActivity() {
    lateinit var binding: ActivityIntentForResultExampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityIntentForResultExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)
         binding.btn.setOnClickListener {
             val intent = Intent()
             val message = binding.etResult.text.toString()
             intent.putExtra("message",message)
             setResult(Activity.RESULT_OK, intent)
             finish()
         }

    }
}