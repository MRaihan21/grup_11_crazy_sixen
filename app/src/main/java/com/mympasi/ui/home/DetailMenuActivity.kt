package com.mympasi.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.mympasi.Models.MakananUtama
import com.mympasi.R
import com.mympasi.databinding.ActivityDetailMenuBinding

class DetailMenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_menu)

        binding = ActivityDetailMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivArrowBack.setOnClickListener {
            onBackPressed()
        }

        val makananUtama = intent.getParcelableExtra<MakananUtama>(HomeFragment.INTENT_PARCELABLE)

        val img = findViewById<ImageView>(R.id.iv_img_resep)
        val desc = findViewById<TextView>(R.id.tv_desc_menu)
        val bahan = findViewById<TextView>(R.id.tv_desc_bahan)
        val cara = findViewById<TextView>(R.id.tv_desc_cara)

        img.setImageResource(makananUtama?.img!!)
        desc.text = makananUtama.desc
        bahan.text = makananUtama.bahan
        cara.text = makananUtama.carar

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}