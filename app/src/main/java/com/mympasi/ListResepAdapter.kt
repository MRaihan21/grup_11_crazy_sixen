//package com.mympasi
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.bumptech.glide.Glide
//import com.bumptech.glide.request.RequestOptions
//
//
//class ListResepAdapter(private val listResep: ArrayList<Resep>): RecyclerView.Adapter<ListResepAdapter.ListViewHolder>() {
//
//    private lateinit var onItemClickCallback: OnItemClickCallback
//
//    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
//        this.onItemClickCallback = onItemClickCallback
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
//        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.activity_detail_menu, parent, false)
//        return ListViewHolder(view)
//    }
//
//    override fun getItemCount(): Int = listResep.size
//
//    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
//
//        val player = listResep[position]
//
//        Glide.with(holder.itemView.context)
//            .load(player.photo)
//            .apply(RequestOptions().override(350, 550))
//            .into(holder.imgPhoto)
//        holder.tvName.text = player.nama
//        holder.itemView.setOnClickListener {
//
//        }
//
//        val (name, desc, bahan, cara, photo) = listResep[position]
//        holder.imgPhoto.setImageResource(photo)
//        holder.tvName.text = name
//        holder.itemView.setOnClickListener {
//            onItemClickCallback.onItemClicked(listResep[holder.adapterPosition])
//        }
//
//    }
//
//
//    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
//        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
//    }
//
//    interface OnItemClickCallback {
//        fun onItemClicked(data: Resep)
//    }
//}
