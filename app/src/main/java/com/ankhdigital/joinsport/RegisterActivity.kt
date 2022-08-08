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

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val tvRegister: TextView = findViewById(R.id.tv_login)
        val tietFullName: TextInputEditText = findViewById(R.id.tiet_fullname)
        val tietEmail: TextInputEditText = findViewById(R.id.tiet_email)
        val tietPassword: TextInputEditText = findViewById(R.id.tiet_password)
        val tietConfirmPassword: TextInputEditText = findViewById(R.id.tiet_confirm_password)
        val btnRegister: MaterialButton = findViewById(R.id.btn_register)

        tvRegister.apply {
            setTextGradientColor(
                intArrayOf(
                    getColor(R.color.startGradient),
                    getColor(R.color.endGradient)
                )
            )
        }

        val editTexts = listOf(tietFullName, tietEmail, tietPassword, tietConfirmPassword)
        for (editText in editTexts) {
            editText.addTextChangedListener(object : TextWatcher {
                override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                    val et1 = tietFullName.text.toString().trim()
                    val et2 = tietEmail.text.toString().trim()
                    val et3 = tietPassword.text.toString().trim()
                    val et4 = tietConfirmPassword.text.toString().trim()

                    btnRegister.isEnabled = et1.isNotEmpty()
                            && et2.isNotEmpty()
                            && et3.isNotEmpty()
                            && et4.isNotEmpty()

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