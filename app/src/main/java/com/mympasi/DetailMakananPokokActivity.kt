//package com.mympasi
//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//
//class DetailMakananPokokActivity : AppCompatActivity() {
//
//    private lateinit var rvResep: RecyclerView
//    private val list = ArrayList<Resep>()
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_detail_makanan_pokok)
//
//        list.addAll(ResepData.makananPokok)
//
//    }
//
//    private fun showRecylerList(){
//        rvResep.layoutManager = LinearLayoutManager(this)
//        val listResepAdapter = ListResepAdapter(list)
//        rvResep.adapter = listResepAdapter
//
//        listResepAdapter.setOnItemClickCallback(object : ListResepAdapter.OnItemClickCallback{
//            override fun onItemClicked(data: Resep) {
//                val moveIntentDetail = Intent(this@DetailMakananPokokActivity, DetailResepActivity::class.java)
//                moveIntentDetail.putExtra("Data", data)
//                startActivity(moveIntentDetail)
//            }
//        })
//    }
//
//}