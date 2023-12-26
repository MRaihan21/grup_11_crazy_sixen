package com.mympasi.Activity.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mympasi.R
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

//            val beratBadan = binding.edtBeratbadan.text.toString().trim()
//            val tinggiBadan = binding.edtTinggibadan.text.toString().trim()
//            val pilihUmur = binding.edtPilihumurbayi.text.toString().trim()
//            val jenisKelamin = binding.edtJeniskelamin.text.toString().trim()
//
//
//            if (beratBadan.isEmpty() || tinggiBadan.isEmpty() || pilihUmur.isEmpty() || jenisKelamin.isEmpty()) {
//
//                if (beratBadan.isEmpty()) {
//                    binding.edtBeratbadan.error = "Isi Semua Data"
//                }
//                if (tinggiBadan.isEmpty()) {
//                    binding.edtTinggibadan.error = "Isi Semua Data"
//                }
//                if (pilihUmur.isEmpty()) {
//                    binding.edtPilihumurbayi.error = "Isi Semua Data"
//                }
//                if (jenisKelamin.isEmpty()) {
//                    binding.edtJeniskelamin.error = "Isi Semua Data"
//                }
//            } else {
                    val intent = Intent(this, RegisterActivity::class.java)
                    startActivity(intent)
//                }


        }


    }
}