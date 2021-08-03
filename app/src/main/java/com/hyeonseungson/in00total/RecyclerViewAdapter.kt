package com.hyeonseungson.in00total

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewAdapter (val items : MutableList<String>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item, parent, false)
        Log.d ("view??", view.toString())
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapter.ViewHolder, position: Int) {

        println("items (Adapter) : $items")

        holder.bindItems(items[position])
    }

    override fun getItemCount(): Int {

        println("getItemCount : ${items.size}")

        return items.size
    }

    inner class ViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems (item : String) {

            Log.d("itemView?", itemView.toString())

            val rv_text = itemView.findViewById<TextView>(R.id.recyclerViewItem)
            rv_text.text = item

            println("ViewHolder : $item")
        }
    }
}
