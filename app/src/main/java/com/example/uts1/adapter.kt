package com.example.uts1

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list.view.*

class adapter(private val arrayList: ArrayList<fakultas>, private val context:Context): RecyclerView.Adapter<adapter.ViewHolder>() {
    class ViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
        fun bindItems(fakultas: fakultas){
            itemView.textView.text=fakultas.nama
            itemView.imageView5.setImageResource(fakultas.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener{
            val fakultas = arrayList[position]
            val nama:String = fakultas.nama
            val desc:String = fakultas.des
            val jur:String = fakultas.jur
            val gmb:Int = fakultas.image

            val intent=Intent(context, MainActivity2::class.java)
            intent.putExtra("nama", nama)
            intent.putExtra("deskripsi", desc)
            intent.putExtra("jurusan", jur)
            intent.putExtra("gmb", gmb)
            context.startActivity(intent)
        }
    }
}