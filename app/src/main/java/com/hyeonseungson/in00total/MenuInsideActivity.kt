package com.hyeonseungson.in00total

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MenuInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_inside)

        val getData = intent.getStringExtra("data")

        val menuText = findViewById<ImageView>(R.id.menuSelect)

        if (getData == "1") {
            menuText.setImageResource(R.drawable.mandeum_menu01)
        }
        if (getData == "2") {
            menuText.setImageResource(R.drawable.mandeum_menu02)
        }
        if (getData == "3") {
            menuText.setImageResource(R.drawable.mandeum_menu03)
        }
        if (getData == "4") {
            menuText.setImageResource(R.drawable.mandeum_menu04)
        }
    }
}