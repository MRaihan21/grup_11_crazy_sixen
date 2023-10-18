package com.mympasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mympasi.databinding.ActivityEditProfileBinding
import com.mympasi.databinding.ActivityPengaturanAcitivityBinding

class EditProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnSimpaneditprofile.setOnClickListener {
            val intent = Intent(this, PengaturanAcitivity::class.java)
            startActivity(intent)
        }

    }
}