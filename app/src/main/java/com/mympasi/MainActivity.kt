package com.mympasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mympasi.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.iconSetting.setOnClickListener {
            val intent = Intent(this, PengaturanAcitivity::class.java)
            startActivity(intent)
        }

        binding.menu612.setOnClickListener {
            val intent = Intent(this, Menu612Activity::class.java)
            startActivity(intent)
        }

        binding.menu1324.setOnClickListener {
            val intent = Intent(this, Menu1324Activity::class.java)
            startActivity(intent)
        }


    }
}
