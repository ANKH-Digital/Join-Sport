package com.ankhdigital.joinsport

import android.graphics.LinearGradient
import android.graphics.Shader
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.TextView
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val tvLogin : TextView = findViewById(R.id.tv_register)
        val tietEmail: TextInputEditText = findViewById(R.id.tiet_email)
        val tietPassword: TextInputEditText = findViewById(R.id.tiet_password)
        val btnLogin : MaterialButton = findViewById(R.id.btn_login)

        tvLogin.apply {
            setTextGradientColor(
                intArrayOf(
                    getColor(R.color.startGradient),
                    getColor(R.color.endGradient)
                )
            )
        }

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