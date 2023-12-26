package com.mympasi.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mympasi.Models.News
import com.mympasi.R

class NewsAdapter (
    private var newsList: List<News>,
    var listener: (News) -> Unit)
    : RecyclerView.Adapter<NewsAdapter.ViewHolder>(){

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val img: ImageView = view.findViewById(R.id.img_news)
        val title: TextView = view.findViewById(R.id.title_news_container)

        fun bindView(news :News, listener: (News) -> Unit){
            img.setImageResource(news.img)
            title.text = news.title
            itemView.setOnClickListener{
                listener(news)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int = newsList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bindView(newsList[position], listener)

        val news = newsList[position]
        holder.img.setImageResource(news.img)
        holder.title.text = news.title
        itemCount

    }

}