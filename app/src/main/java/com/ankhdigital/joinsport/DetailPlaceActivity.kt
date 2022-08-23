package com.ankhdigital.joinsport

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.ankhdigital.joinsport.databinding.ActivityPlaceDetailBinding

class DetailPlaceActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlaceDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPlaceDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initUI()
    }

    private fun initUI() {
        binding.apply {
            ivBack.setOnClickListener {
                findNavController(R.id.nav_host_fragment_activity_home).navigate(R.id.navigation_place)
            }
        }
    }
}