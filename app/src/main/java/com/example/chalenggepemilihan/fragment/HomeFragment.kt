package com.example.chalenggepemilihan.fragment

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.chalenggepemilihan.PemilihanActivity
import com.example.chalenggepemilihan.R
import com.example.chalenggepemilihan.RiwayatPemilihanActivity


class HomeFragment : Fragment() {
    private lateinit var btnRiwayat : TextView
    private lateinit var btnHasil: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_home, container, false)
        btnRiwayat = view.findViewById(R.id.txtRiwayatPemilihan)
        btnHasil = view.findViewById(R.id.btnHasil)

        btnRiwayat.setOnClickListener{
            val intent = Intent(activity, RiwayatPemilihanActivity::class.java)
            startActivity(intent)
        }

        btnHasil.setOnClickListener{
            val intent = Intent(activity, PemilihanActivity::class.java)
            startActivity(intent)
        }

        return view
    }


}