package com.example.chalenggepemilihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class VerifikasiPinActivity : AppCompatActivity() {
    private lateinit var editText1 : EditText
    private lateinit var editText2 : EditText
    private lateinit var editText3 : EditText
    private lateinit var editText4 : EditText
    private lateinit var editText5 : EditText
    private lateinit var editText6 : EditText
    private lateinit var btnVerifikasi : Button
    private lateinit var sessionManager: SessionManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verifikasi_pin)

        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)
        editText3 = findViewById(R.id.editText3)
        editText4 = findViewById(R.id.editText4)
        editText5 = findViewById(R.id.editText5)
        editText6 = findViewById(R.id.editText6)
        btnVerifikasi = findViewById(R.id.btnVerifikasi)
        sessionManager = SessionManager(this)

        editText1.filters = arrayOf(InputFilter.LengthFilter(1))
        editText2.filters = arrayOf(InputFilter.LengthFilter(1))
        editText3.filters = arrayOf(InputFilter.LengthFilter(1))
        editText4.filters = arrayOf(InputFilter.LengthFilter(1))
        editText5.filters = arrayOf(InputFilter.LengthFilter(1))
        editText6.filters = arrayOf(InputFilter.LengthFilter(1))

        editText1.requestFocus()

        editText1.setOnKeyListener { v, keyCode, event ->
            if (editText1.text.toString().length == 1) {
                editText2.requestFocus()
            }
            false
        }
        editText2.setOnKeyListener { v, keyCode, event ->
            if (editText2.text.toString().length == 1) {
                editText3.requestFocus()
            }
            false
        }

        editText3.setOnKeyListener { v, keyCode, event ->
            if (editText3.text.toString().length == 1) {
                editText4.requestFocus()
            }
            false
        }

        editText4.setOnKeyListener { v, keyCode, event ->
            if (editText4.text.toString().length == 1) {
                editText5.requestFocus()
            }
            false
        }

        editText5.setOnKeyListener { v, keyCode, event ->
            if (editText5.text.toString().length == 1) {
                editText6.requestFocus()
            }
            false
        }

        editText6.setOnKeyListener { v, keyCode, event ->
            if (editText6.text.toString().length == 1) {
                btnVerifikasi.requestFocus()
            }
            false
        }

        btnVerifikasi.setOnClickListener {
            val inputPin = editText1.text.toString() + editText2.text.toString() + editText3.text.toString() + editText4.text.toString() + editText5.text.toString() + editText6.text.toString()
            val pin = sessionManager.getPin()

            if(inputPin == pin) {
                val intent = Intent(this, BerhasilActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Pin Salah", Toast.LENGTH_SHORT).show()
            }
        }

    }
}