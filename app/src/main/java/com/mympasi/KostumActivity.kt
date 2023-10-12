package com.mympasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mympasi.databinding.ActivityKostumBinding
import com.mympasi.databinding.ActivityMenuBinding

class KostumActivity : AppCompatActivity() {

    private lateinit var binding: ActivityKostumBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kostum)

        binding = ActivityKostumBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.makananpokok.setOnClickListener {
            val intent = Intent(this, DetailResepActivity::class.java)
            startActivity(intent)
        }

    }
}