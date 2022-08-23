package com.ankhdigital.joinsport

import android.content.Intent
import android.graphics.LinearGradient
import android.graphics.Shader
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.TextView
import com.ankhdigital.joinsport.databinding.ActivityLoginBinding
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initUI()
    }

    private fun initUI() {

        binding.apply {

            val edittexts = listOf(tietEmail,tietPassword)
            for (editText in edittexts) {
                editText.addTextChangedListener(object : TextWatcher {
                    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                        val et = tietEmail.text.toString().trim()
                        val et2 = tietPassword.text.toString().trim()

                        btnLogin.isEnabled = et.isNotEmpty()
                                && et2.isNotEmpty()

                        if (btnLogin.isEnabled)
                            btnLogin.setBackgroundResource(R.drawable.bg_rectangle_button)
                        else
                            btnLogin.setBackgroundResource(R.drawable.bg_rectangle_gray_button)
                    }

                    override fun beforeTextChanged(
                        s: CharSequence, start: Int, count: Int, after: Int
                    ) {
                    }

                    override fun afterTextChanged(
                        s: Editable
                    ) {
                    }
                })
            }

            tvRegister.apply {
                setTextGradientColor(
                    intArrayOf(
                        getColor(R.color.startGradient),
                        getColor(R.color.endGradient)
                    )
                )
            }

            tvRegister.setOnClickListener {
                val goToLoginActivity = Intent(applicationContext, LoginActivity::class.java)
                startActivity(goToLoginActivity)
            }
            
            btnLogin.setOnClickListener {
                val goToMainActivity = Intent(applicationContext, MainActivity::class.java)
                startActivity(goToMainActivity)
            }

        }
    }

    fun TextView.setTextGradientColor(colors: IntArray) {
        val width = paint.measureText(text.toString())

        val textShader = LinearGradient(
            0f, 0f, width, textSize, colors, null, Shader.TileMode.CLAMP
        )
        setTextColor(colors[0])
        paint.shader = textShader
    }
}