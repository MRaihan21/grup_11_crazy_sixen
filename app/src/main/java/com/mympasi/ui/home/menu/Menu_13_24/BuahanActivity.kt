package com.mympasi.ui.home.menu.Menu_13_24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mympasi.R
import com.mympasi.databinding.ActivityBuahanBinding

class BuahanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBuahanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buahan)

        binding = ActivityBuahanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivArrowBack.setOnClickListener {
            onBackPressed()
        }

    }
}