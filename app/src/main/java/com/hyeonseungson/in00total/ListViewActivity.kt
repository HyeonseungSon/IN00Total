package com.hyeonseungson.in00total

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val list_item = mutableListOf<ListViewModel>()

        list_item.add(ListViewModel("제목1", "내용1"))
        list_item.add(ListViewModel("제목2", "내용2"))
        list_item.add(ListViewModel("제목3", "내용3"))

        val listView = findViewById<ListView>(R.id.mainListView)

        val listAdapter = ListViewAdapter(list_item)
        listView.adapter = listAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, list_item[position].title, Toast.LENGTH_SHORT).show()
        }
    }
}