package com.mympasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mympasi.databinding.ActivityDataBayiBinding

class DataBayiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDataBayiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_bayi)

        binding = ActivityDataBayiBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnSlnjt.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }


    }
}