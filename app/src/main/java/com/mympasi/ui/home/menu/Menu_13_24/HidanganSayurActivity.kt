package com.mympasi.ui.home.menu.Menu_13_24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mympasi.R
import com.mympasi.databinding.ActivityHidanganSayurBinding

class HidanganSayurActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHidanganSayurBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hidangan_sayur)

        binding = ActivityHidanganSayurBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivArrowBack.setOnClickListener {
            onBackPressed()
        }

    }
}