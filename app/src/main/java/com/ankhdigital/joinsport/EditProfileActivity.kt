package com.ankhdigital.joinsport

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.NavOptions
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.ankhdigital.joinsport.databinding.ActivityEditProfileBinding

class EditProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initUI()
    }

    private fun initUI() {
        binding.apply {
            ivBack.setOnClickListener {
                findNavController(R.id.nav_host_fragment_activity_home).navigate(R.id.navigation_profile)
            }
            btnSave.setOnClickListener{
                findNavController(R.id.nav_host_fragment_activity_home).navigate(R.id.navigation_profile)
            }
        }
    }
}