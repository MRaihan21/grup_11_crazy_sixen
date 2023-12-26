package com.mympasi.ui.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.mympasi.Models.News
import com.mympasi.R
import com.mympasi.databinding.ActivityDetailNewsBinding

class DetailNewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailNewsBinding

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_news)

        binding = ActivityDetailNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val news = intent.getParcelableExtra<News>(NewsFragment.INTENT_PARCELABLE)

        val title = findViewById<TextView>(R.id.tv_title_news)
        val img = findViewById<ImageView>(R.id.iv_image_news)
        val desc = findViewById<TextView>(R.id.tv_content_news)

        title.text = news?.title!!
        img.setImageResource(news.img)
        desc.text = news.desc

        binding.ivArrowBack.setOnClickListener {
            onBackPressed()
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}