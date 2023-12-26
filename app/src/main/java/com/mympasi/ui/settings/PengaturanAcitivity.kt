package com.mympasi.ui.settings

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mympasi.Activity.Login.LoginActivity
import com.mympasi.databinding.ActivityPengaturanAcitivityBinding

class PengaturanAcitivity : AppCompatActivity() {

    private lateinit var binding: ActivityPengaturanAcitivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPengaturanAcitivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val username = intent.getStringExtra("USERNAME")
        val email = intent.getStringExtra("EMAIL")

        if (username != null && email != null) {
            binding.tvUsername.text = "$username"
            binding.tvGmail.text = "$email"
        }

        binding.btnKeluar.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.tvEditprofile.setOnClickListener {
            val intent = Intent(this, EditProfileActivity::class.java)
            startActivity(intent)
        }

        binding.tvEditdatabayi.setOnClickListener {
            val intent = Intent(this, EditDataBayiActivity::class.java)
            startActivity(intent)
        }
    }
}
