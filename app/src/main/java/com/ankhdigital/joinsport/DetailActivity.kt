package com.ankhdigital.joinsport

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.ankhdigital.joinsport.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.apply {
            ivBack.setOnClickListener {
                findNavController(R.id.nav_host_fragment_activity_home).navigate(R.id.navigation_home)
            }
        }
    }
}