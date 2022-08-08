package com.ankhdigital.joinsport

import android.content.Intent
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextPaint
import android.widget.ImageView
import android.widget.TextView

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val ivJoinSport: ImageView = findViewById(R.id.imageView)

        ivJoinSport.setOnClickListener {
            val goToOnBoardingActivity = Intent(this, OnBoardingActivity::class.java)
            startActivity(goToOnBoardingActivity)
        }
    }
}