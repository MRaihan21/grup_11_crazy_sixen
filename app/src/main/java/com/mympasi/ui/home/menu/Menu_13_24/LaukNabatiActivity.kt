package com.mympasi.ui.home.menu.Menu_13_24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mympasi.R
import com.mympasi.databinding.ActivityLaukNabatiBinding

class LaukNabatiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLaukNabatiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lauk_nabati)

        binding = ActivityLaukNabatiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivArrowBack.setOnClickListener {
            onBackPressed()
        }

    }
}