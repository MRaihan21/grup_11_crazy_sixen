package com.mympasi.ui.home.menu.Menu_13_24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mympasi.R
import com.mympasi.databinding.ActivityMakananPokokBinding

class MakananPokokActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMakananPokokBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makanan_pokok)

        binding = ActivityMakananPokokBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivArrowBack.setOnClickListener {
            onBackPressed()
        }

    }
}