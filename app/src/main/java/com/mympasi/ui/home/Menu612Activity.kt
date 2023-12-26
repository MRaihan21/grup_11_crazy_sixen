package com.mympasi.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mympasi.ui.home.menu.Menu_6_12.MakananSelinganActivity
import com.mympasi.ui.home.menu.Menu_6_12.MakananUtamaActivity
import com.mympasi.R
import com.mympasi.databinding.ActivityMenu612Binding

class Menu612Activity : AppCompatActivity() {

    private lateinit var binding: ActivityMenu612Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_6_12)

        binding = ActivityMenu612Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.apply {
            ivArrowBack.setOnClickListener {
                onBackPressed()
            }
        }

        binding.btnMakananutama.setOnClickListener {
            val intent = Intent(this, MakananUtamaActivity::class.java)
            startActivity(intent)
        }

        binding.btnMakananselingan.setOnClickListener {
            val intent = Intent(this, MakananSelinganActivity::class.java)
            startActivity(intent)
        }

    }
}