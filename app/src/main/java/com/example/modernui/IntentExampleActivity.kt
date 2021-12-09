package com.example.modernui

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import com.example.modernui.databinding.ActivityIntentExampleBinding

class IntentExampleActivity : AppCompatActivity() {
    lateinit var binding: ActivityIntentExampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {   // bundle : rabet beine activity & Xml
        super.onCreate(savedInstanceState)
        binding = ActivityIntentExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)
       // setContentView(R.layout.activity_main)  // ba kelase R be hameye id ha va kelass ha dastresi darim.

        val bundle:Bundle? = intent.extras    // باندل: تمام اطلاعاتی گه از یک Activity دیگه گرفتیم میره توی باندل
        bundle?.let {
            val mentorName = bundle.getString(Constants.MENTOR_NAME) + " xxx"
            binding.tvMentorName.text = mentorName
            showToast(mentorName)
        }

        val openExampleForResultExampleActivity =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            if (it.resultCode==Activity.RESULT_OK){
                showToast(it.data?.getStringExtra("message").toString())
                binding.tvMentorName.setText(it.data?.getStringExtra("message").toString())
            }
        }

        binding.buttonStartActivityWithResult.setOnClickListener {
            openExampleForResultExampleActivity.launch(
            Intent(this,IntentForResultExampleActivity::class.java).apply {
                putExtra("ID",1)
            })
        }
    }
}