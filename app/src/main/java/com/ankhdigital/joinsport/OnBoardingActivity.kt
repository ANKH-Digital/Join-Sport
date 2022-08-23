package com.ankhdigital.joinsport

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ankhdigital.joinsport.databinding.ActivityOnBoardingBinding

class OnBoardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnBoardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnGetstarted.setOnClickListener {
            val goToRegisterActivity = Intent(this, RegisterActivity::class.java)
            startActivity(goToRegisterActivity)
        }

    }
}