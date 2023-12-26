package com.mympasi.ui.settings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mympasi.R
import com.mympasi.databinding.ActivityEditProfileBinding

class EditProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.apply {
            ivArrowBack.setOnClickListener {
                onBackPressed()
            }
            btnSimpaneditprofile.setOnClickListener {
                onBackPressed()
                Toast.makeText(this@EditProfileActivity, "Saved Data", Toast.LENGTH_SHORT).show()
            }
        }



    }
}