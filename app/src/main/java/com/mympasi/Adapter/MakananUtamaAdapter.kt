package com.mympasi.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mympasi.Models.MakananUtama
import com.mympasi.R

class MakananUtamaAdapter (
    private var makananUtamaList: List<MakananUtama>,
    var listener: (MakananUtama) -> Unit)
    : RecyclerView.Adapter<MakananUtamaAdapter.ViewHolder>(){

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val img: ImageView = view.findViewById(R.id.iv_img_menu)
        val title: TextView = view.findViewById(R.id.tv_title_menu)

        fun bindView(makananUtama : MakananUtama, listener: (MakananUtama) -> Unit){
            img.setImageResource(makananUtama.img)
            title.text = makananUtama.title
            itemView.setOnClickListener{
                listener(makananUtama)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int = makananUtamaList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bindView(makananUtamaList[position], listener)

        val makananUtama = makananUtamaList[position]
        holder.img.setImageResource(makananUtama.img)
        holder.title.text = makananUtama.title
        itemCount
    }


}