package com.example.rekukler

import android.content.ClipData
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Rekukler:RecyclerView.Adapter<Rekukler.Companion.ValutesViewHolder>() {
    var valutes = mutableListOf<Item>()
    companion object{
        class ValutesViewHolder(view:View):RecyclerView.ViewHolder(view){
            var textView:TextView = view.findViewById(R.id.textView)
            var imageView:ImageView = view.findViewById(R.id.imageView)
            fun bind(string: Item){
                textView.text = string.str
                imageView.setImageResource(string.drawable)
        }
    }
}

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ValutesViewHolder {
        var view = ValutesViewHolder(LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.valutes_item, viewGroup, false))
        return view
    }

    override fun onBindViewHolder(holder: ValutesViewHolder, position: Int) {
        holder.bind(valutes[position])
    }

    override fun getItemCount(): Int {
        return valutes.size
    }

}
data class Item(val str:String, val drawable:Int)
