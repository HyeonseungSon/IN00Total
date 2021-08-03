package com.hyeonseungson.in00total

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Banana1Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {

        val view = inflater.inflate(R.layout.fragment_banana1, container, false)

        val items = mutableListOf<String>()

        for (i in 1..10) {
            items.add("BANANA : $i")
        }

        println("List Banana : $items")

        val mandeumRV = view.findViewById<RecyclerView>(R.id.rvMandeumMain1)
        val rvAdapter = RecyclerViewAdapter(items)

        Log.d("rvAdapter : ", rvAdapter.toString())

        mandeumRV.adapter = rvAdapter
        mandeumRV.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.pizzaImage).setOnClickListener {
            it.findNavController().navigate(R.id.action_banana1Fragment_to_pizza2Fragment)
        }
        view.findViewById<ImageView>(R.id.monkeyImage).setOnClickListener {
            it.findNavController().navigate(R.id.action_banana1Fragment_to_monkey2Fragment)
        }
        return view
    }
}