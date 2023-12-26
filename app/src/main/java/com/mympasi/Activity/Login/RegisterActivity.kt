package com.mympasi.Activity.Login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mympasi.MainActivity
import com.mympasi.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnRegis.setOnClickListener {
//            val userName = binding.edtUsernameRegis.text.toString().trim()
//            val email = binding.edtEmailRegis.text.toString().trim()
//            val password = binding.edtPasswordRegis.text.toString().trim()
//            val confirmPass = binding.edtConfirmRegis.text.toString().trim()
//
//            if (userName.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPass.isEmpty()) {
//                // Handle empty fields
//            } else {
                val intent = Intent(this, MainActivity::class.java)
//                intent.putExtra("USERNAME", userName) // Regimen data username
//                intent.putExtra("EMAIL", email) // Mengirim data email
                startActivity(intent)
//            }
        }
    }
}
