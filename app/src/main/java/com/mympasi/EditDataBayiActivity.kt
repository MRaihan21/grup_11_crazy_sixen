package com.mympasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mympasi.databinding.ActivityEditDataBayiBinding
import com.mympasi.databinding.ActivityEditProfileBinding

class EditDataBayiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditDataBayiBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_data_bayi)

        binding = ActivityEditDataBayiBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnSimpaneditdata.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}