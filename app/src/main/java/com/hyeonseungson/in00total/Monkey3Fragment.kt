package com.hyeonseungson.in00total

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Monkey2Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_monkey3, container, false)

        val items = mutableListOf<String>()

        for (i in 1..100) {
            items.add("MONKEY : $i")
        }

        println("List Monkey : $items")

        val mandeumRV = view.findViewById<RecyclerView>(R.id.rvMandeumMain3)
        val rvAdapter = RecyclerViewAdapter (items)

        mandeumRV.adapter = rvAdapter
        mandeumRV.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.bananaImage).setOnClickListener {
            it.findNavController().navigate(R.id.action_monkey2Fragment_to_banana1Fragment)
        }
        view.findViewById<ImageView>(R.id.pizzaImage).setOnClickListener {
            it.findNavController().navigate(R.id.action_monkey2Fragment_to_pizza2Fragment)
        }

        return view
    }
}