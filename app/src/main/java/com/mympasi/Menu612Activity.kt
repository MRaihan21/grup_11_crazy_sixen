package com.mympasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mympasi.databinding.ActivityMenu612Binding

class Menu612Activity : AppCompatActivity() {

    private lateinit var binding: ActivityMenu612Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_6_12)

        binding = ActivityMenu612Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        binding.btnMakananutama.setOnClickListener {
//            val intent = Intent(this, DetailResepActivity::class.java)
//            startActivity(intent)
//        }

    }
}