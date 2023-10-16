package com.mympasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mympasi.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnRegis.setOnClickListener {

            val userName = binding.edtUsernameRegis.text.toString().trim()
            val email = binding.edtEmailRegis.text.toString().trim()
            val password = binding.edtPasswordRegis.text.toString().trim()
            val confirmPass = binding.edtConfirmRegis.text.toString().trim()

            if (userName.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPass.isEmpty()) {
                if (userName.isEmpty()){
                    binding.edtUsernameRegis.error = "Isi semua data"
                }
                if (email.isEmpty()){
                    binding.edtEmailRegis.error = "Isi semua data"
                }
                if (password.isEmpty()){
                    binding.edtPasswordRegis.error = "Isi semua data"
                }
                if (confirmPass.isEmpty()){
                    binding.edtConfirmRegis.error = "Isi semua data"
                }

            } else {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }


        }


        binding.btntvTextLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}