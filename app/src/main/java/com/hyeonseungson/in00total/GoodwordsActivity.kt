package com.hyeonseungson.in00total

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class GoodwordsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_good_words)

        // String List 생성
        //val goodWordsList = mutableListOf<ListViewModel>()

        val goodWordsList = mutableListOf<ListViewModel>()

        // goodWordsList 에 21개의 요소 추가
        goodWordsList.add(ListViewModel("1","사람에게 하나의 입과 두 개의 귀가 있는 것은 말하기보다 듣기를 두 배로 하라는 뜻이다."))
        goodWordsList.add(ListViewModel("2","결점이 없는 친구를 사귀려고 한다면 평생 친구를 가질 수 없을 것이다."))
        goodWordsList.add(ListViewModel("3","자기 아이에게 육체적 노동을 가르치지 않는 것은 약탈과 강도를 가르치는 것과 마찬가지다."))
        goodWordsList.add(ListViewModel("4","승자는 눈을 밟아 길을 만들지만 패자는 눈이 녹기를 기다린다."))
        goodWordsList.add(ListViewModel("5","두 개의 화살을 갖지 마라. 두 번째 화살이 있기 때문에 첫 번째 화살에 집중하지 않게 된다."))
        goodWordsList.add(ListViewModel("6","그 사람 입장에 서기 전까지 절대 그 사람을 욕하거나 책망하지 마라."))
        goodWordsList.add(ListViewModel("7","뛰어난 말에게도 채찍이 필요하다."))
        goodWordsList.add(ListViewModel("8","사람에게 하나의 입과 두 개의 귀가 있는 것은 말하기보다 듣기를 두 배로 하라는 뜻이다."))
        goodWordsList.add(ListViewModel("9","결점이 없는 친구를 사귀려고 한다면 평생 친구를 가질 수 없을 것이다."))
        goodWordsList.add(ListViewModel("10","자기 아이에게 육체적 노동을 가르치지 않는 것은 약탈과 강도를 가르치는 것과 마찬가지다."))
        goodWordsList.add(ListViewModel("11","승자는 눈을 밟아 길을 만들지만 패자는 눈이 녹기를 기다린다."))
        goodWordsList.add(ListViewModel("12","두 개의 화살을 갖지 마라. 두 번째 화살이 있기 때문에 첫 번째 화살에 집중하지 않게 된다."))
        goodWordsList.add(ListViewModel("13","그 사람 입장에 서기 전까지 절대 그 사람을 욕하거나 책망하지 마라."))
        goodWordsList.add(ListViewModel("14","뛰어난 말에게도 채찍이 필요하다."))
        goodWordsList.add(ListViewModel("15","사람에게 하나의 입과 두 개의 귀가 있는 것은 말하기보다 듣기를 두 배로 하라는 뜻이다."))
        goodWordsList.add(ListViewModel("16","결점이 없는 친구를 사귀려고 한다면 평생 친구를 가질 수 없을 것이다."))
        goodWordsList.add(ListViewModel("17","자기 아이에게 육체적 노동을 가르치지 않는 것은 약탈과 강도를 가르치는 것과 마찬가지다."))
        goodWordsList.add(ListViewModel("18","승자는 눈을 밟아 길을 만들지만 패자는 눈이 녹기를 기다린다."))
        goodWordsList.add(ListViewModel("19","두 개의 화살을 갖지 마라. 두 번째 화살이 있기 때문에 첫 번째 화살에 집중하지 않게 된다."))
        goodWordsList.add(ListViewModel("20","그 사람 입장에 서기 전까지 절대 그 사람을 욕하거나 책망하지 마라."))
        goodWordsList.add(ListViewModel("21","뛰어난 말에게도 채찍이 필요하다."))

        /*
        goodWordsList.add("사람에게 하나의 입과 두 개의 귀가 있는 것은 말하기보다 듣기를 두 배로 하라는 뜻이다.")
        goodWordsList.add("결점이 없는 친구를 사귀려고 한다면 평생 친구를 가질 수 없을 것이다.")
        goodWordsList.add("자기 아이에게 육체적 노동을 가르치지 않는 것은 약탈과 강도를 가르치는 것과 마찬가지다.")
         */

        val goodWordsListView = findViewById<ListView>(R.id.goodWordsListView)

        val listViewAdapter = ListViewAdapter(goodWordsList)
        goodWordsListView.adapter = listViewAdapter


    }
}