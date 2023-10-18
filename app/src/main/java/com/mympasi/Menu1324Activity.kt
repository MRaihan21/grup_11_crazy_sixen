package com.mympasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mympasi.databinding.ActivityMenu1324Binding

class Menu1324Activity : AppCompatActivity() {

    private lateinit var binding: ActivityMenu1324Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_13_24)

        binding = ActivityMenu1324Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnMakananpokok.setOnClickListener {
            val intent = Intent(this, MakananPokokActivity::class.java)
            startActivity(intent)
        }

        binding.btnNabati.setOnClickListener {
            val intent = Intent(this, LaukNabatiActivity::class.java)
            startActivity(intent)
        }

        binding.btnHewani.setOnClickListener {
            val intent = Intent(this, LaukHewaniActivity::class.java)
            startActivity(intent)
        }

        binding.btnHidangan.setOnClickListener {
            val intent = Intent(this, HidanganSayurActivity::class.java)
            startActivity(intent)
        }

        binding.btnSelingan.setOnClickListener {
            val intent = Intent(this, MakananSelingan2Activity::class.java)
            startActivity(intent)
        }

        binding.btnBuah.setOnClickListener {
            val intent = Intent(this, BuahanActivity::class.java)
            startActivity(intent)
        }

    }
}