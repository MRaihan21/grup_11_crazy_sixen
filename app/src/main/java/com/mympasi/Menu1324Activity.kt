package com.mympasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mympasi.databinding.ActivityMenu1324Binding

class Menu1324Activity : AppCompatActivity() {

    private lateinit var binding: ActivityMenu1324Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_13_24)

        binding = ActivityMenu1324Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        binding.makananpokok.setOnClickListener {
//            val intent = Intent(this, DetailResepActivity::class.java)
//            startActivity(intent)
//        }

    }
}