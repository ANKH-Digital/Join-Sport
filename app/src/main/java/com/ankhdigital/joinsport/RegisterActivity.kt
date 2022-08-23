package com.ankhdigital.joinsport

import android.content.Intent
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.ankhdigital.joinsport.databinding.ActivityRegisterBinding
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initUI()
    }

    private fun initUI() {

        binding.apply {
            
            val editTexts = listOf(tietFullname, tietEmail, tietPassword, tietConfirmPassword)
            for (editText in editTexts) {
                editText.addTextChangedListener(object : TextWatcher {
                    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

                        btnRegister.isEnabled = tietFullname.text!!.isNotEmpty()
                                && tietEmail.text!!.isNotEmpty()
                                && tietPassword.text!!.isNotEmpty() && tietConfirmPassword.text!!.isNotEmpty()
                                && tietPassword.text!!.contentEquals(tietConfirmPassword.text!!)

                        if (btnRegister.isEnabled)
                            btnRegister.setBackgroundResource(R.drawable.bg_rectangle_button)
                        else
                            btnRegister.setBackgroundResource(R.drawable.bg_rectangle_gray_button)
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

            tvLogin.setOnClickListener {
                val goToLoginActivity = Intent(applicationContext, LoginActivity::class.java)
                startActivity(goToLoginActivity)
            }

            tvLogin.setTextGradientColor(
                intArrayOf(
                    getColor(R.color.startGradient),
                    getColor(R.color.endGradient)
                )
            )


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