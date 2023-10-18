//package com.mympasi
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.util.Log
//import com.bumptech.glide.Glide
//import com.bumptech.glide.request.RequestOptions
//import com.mympasi.databinding.ActivityDetailResepBinding
//
//class DetailResepActivity : AppCompatActivity() {
//
//    private lateinit var binding: ActivityDetailResepBinding
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_detail_resep)
//
//        binding = ActivityDetailResepBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        supportActionBar?.title = "Makanan Pokok"
//
//        val data = intent.getParcelableExtra<Resep>("Data")
//        Log.d("Detail Makanan Pokok", data.toString())
//
//        Glide.with(this)
//            .load(data?.photo)
//            .apply(RequestOptions().override(800, 600))
//            .into(binding.imgItemPhoto)
//        binding.tvDesc.text = data?.desc
//        binding.tvDetailBahan.text = data?.bahan
//        binding.tvDetailCara.text = data?.cara
//
//    }
//}