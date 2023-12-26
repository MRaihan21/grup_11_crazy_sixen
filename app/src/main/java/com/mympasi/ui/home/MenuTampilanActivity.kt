package com.mympasi.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mympasi.R
import com.mympasi.databinding.ActivityMenuTampilanBinding

class MenuTampilanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuTampilanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_menu_tampilan)
        binding = ActivityMenuTampilanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            ivArrowBack.setOnClickListener {
                onBackPressed()
            }
        }

    }
}