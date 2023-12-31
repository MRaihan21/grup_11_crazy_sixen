package com.mympasi.Activity.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mympasi.MainActivity
import com.mympasi.R
import com.mympasi.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnLogin.setOnClickListener {

//            val userName = binding.edtInputLogin.text.toString().trim()
//            val password = binding.edtPasswordLogin.text.toString().trim()
//
//            if (userName.isEmpty() || password.isEmpty()) {
//                if (userName.isEmpty()) {
//                    binding.edtInputLogin.error = "Isi Semua Data"
//                }
//                if (password.isEmpty()) {
//                    binding.edtPasswordLogin.error = "Isi Semua Data"
//                }
//            } else {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
//            }
        }

        binding.tvDaftarsekarang.setOnClickListener {
            val intent = Intent(this, DataBayiActivity::class.java)
            startActivity(intent)
        }
    }
}