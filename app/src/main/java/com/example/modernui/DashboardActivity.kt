package com.example.modernui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.modernui.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity() {
    lateinit var binding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)


        showToast("my custom Toast with extension class")

        binding.backB.setOnClickListener {
             Toast.makeText(this,"back Bottom",Toast.LENGTH_LONG).show()
         }

        binding.layoutCards.setOnClickListener {
            Toast.makeText(this,"${getString((R.string.layouts))} clicked.",Toast.LENGTH_LONG).show()
            var message : String = binding.textViewMentorName.text.toString()

            val intent = Intent(this,IntentExampleActivity::class.java)
            intent.putExtra(Constants.MENTOR_NAME,message)
            startActivity(intent)
        }

        binding.lifeCycleCard.setOnClickListener{
            val intent=Intent(this,LifeCycleActivity::class.java)
            startActivity(intent)
        }

        binding.implicitCards.setOnClickListener {
            val intent=Intent(this,ImplicitIntent::class.java)
            startActivity(intent)
        }

    }
}