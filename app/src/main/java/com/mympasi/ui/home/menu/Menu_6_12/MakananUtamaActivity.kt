package com.mympasi.ui.home.menu.Menu_6_12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mympasi.Adapter.MakananUtamaAdapter
import com.mympasi.Models.MakananUtama
import com.mympasi.R
import com.mympasi.databinding.ActivityMakananUtamaBinding
import com.mympasi.ui.home.DetailMenuActivity
import com.mympasi.ui.home.HomeFragment

class MakananUtamaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMakananUtamaBinding

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    private lateinit var makananUtamaList: ArrayList<MakananUtama>

    lateinit var img: Array<Int>
    lateinit var title: Array<String>
    lateinit var desc: Array<String>
    lateinit var bahan: Array<String>
    lateinit var cara: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makanan_utama)

        binding = ActivityMakananUtamaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivArrowBack.setOnClickListener {
            onBackPressed()
        }

        dataInitialize()
        val layoutManager = GridLayoutManager(this, 3, LinearLayoutManager.VERTICAL, false)
        val recyclerView: RecyclerView = findViewById(R.id.rv_makanan_utama)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MakananUtamaAdapter(makananUtamaList){
            val intent = Intent(this, DetailMenuActivity::class.java)
            intent.putExtra(HomeFragment.INTENT_PARCELABLE, it)
            startActivity(intent)
        }


    }

    private fun dataInitialize(){
        makananUtamaList = arrayListOf<MakananUtama>()

        img = arrayOf(
            R.drawable.puree_alpukat_kembang_kol,
            R.drawable.puree_alpukat_ubi_jalar,
            R.drawable.sup_labu,

            )

        title = arrayOf(
            resources.getString(R.string.alpukat),
            resources.getString(R.string.ubi_jalar),
            resources.getString(R.string.sup_labu),

            )

        desc = arrayOf(
            resources.getString(R.string.desc_alpukat),
            resources.getString(R.string.desc_ubi_jalar),
            resources.getString(R.string.desc_sup_labu)
        )

        bahan = arrayOf(
            resources.getString(R.string.bahan_alpukat),
            resources.getString(R.string.bahan_ubi_jalar),
            resources.getString(R.string.bahan_alpukat),
        )

        cara = arrayOf(
            resources.getString(R.string.cara_alpukat),
            resources.getString(R.string.cara_ubi_jalar),
            resources.getString(R.string.cara_sup_labu),
        )

        for (i in img.indices){
            val makananUtama = MakananUtama(
                img[i],
                title[i],
                desc[i],
                bahan[i],
                cara[i]
            )
            makananUtamaList.add(makananUtama)
        }

    }

}