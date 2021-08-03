package com.hyeonseungson.in00total

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class WebViewActivity : AppCompatActivity() {

    private val items = mutableListOf<webSiteModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        items.add(webSiteModel("http://cjcourier.com/", "CJ대한통운"))
        items.add(webSiteModel("http://www.sejintec.co.kr/", "세진기술산업"))
        items.add(webSiteModel("http://www.oluxe.kr/", "오럭스"))
        items.add(webSiteModel("https://xn--3j4bmz12g3wao90cpoa.com/", "셀프인하우스"))

    }
}