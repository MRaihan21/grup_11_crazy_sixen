package com.mympasi.ui.settings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mympasi.R
import com.mympasi.databinding.ActivityEditDataBayiBinding

class EditDataBayiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditDataBayiBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_data_bayi)

        binding = ActivityEditDataBayiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            ivArrowBack.setOnClickListener {
                onBackPressed()
            }
            btnSimpaneditdata.setOnClickListener {
                onBackPressed()
                Toast.makeText(this@EditDataBayiActivity, "Saved Data", Toast.LENGTH_SHORT).show()
            }
        }

    }

}