package com.mympasi.ui.home.menu.Menu_6_12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mympasi.R
import com.mympasi.databinding.ActivityMakananSelinganBinding

class MakananSelinganActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMakananSelinganBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makanan_selingan)

        binding = ActivityMakananSelinganBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivArrowBack.setOnClickListener {
            onBackPressed()
        }

    }
}