package com.mympasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mympasi.databinding.ActivityLoginBinding
import com.mympasi.databinding.ActivityPengaturanAcitivityBinding

class PengaturanAcitivity : AppCompatActivity() {

    private lateinit var binding: ActivityPengaturanAcitivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengaturan_acitivity)

        binding = ActivityPengaturanAcitivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnKeluar.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.tvEditprofile.setOnClickListener {
            val intent = Intent(this, EditProfileActivity::class.java)
            startActivity(intent)
        }

    }
}