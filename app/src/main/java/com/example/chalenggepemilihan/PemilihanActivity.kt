package com.example.chalenggepemilihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PemilihanActivity : AppCompatActivity() {
    private lateinit var btnPilih1 : Button
    private lateinit var btnPilih2 : Button
    private lateinit var btnPilih3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pemilihan)

        btnPilih1 = findViewById(R.id.btnPilih1)
        btnPilih2 = findViewById(R.id.btnPilih2)
        btnPilih3 = findViewById(R.id.btnPilih3)

        btnPilih1.setOnClickListener{
            val intent = Intent(this, VerifikasiPinActivity::class.java)
            startActivity(intent)
        }

        btnPilih2.setOnClickListener{
            val intent = Intent(this, VerifikasiPinActivity::class.java)
            startActivity(intent)
        }

        btnPilih3.setOnClickListener{
            val intent = Intent(this, VerifikasiPinActivity::class.java)
            startActivity(intent)
        }
    }
}