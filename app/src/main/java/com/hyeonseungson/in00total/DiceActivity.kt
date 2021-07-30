package com.hyeonseungson.in00total

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import com.hyeonseungson.in00total.databinding.ActivityMainBinding
import kotlin.random.Random

class DiceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice)

        val btn = findViewById<Button>(R.id.button)

        // 주사위 접근
        val diceImg1 = findViewById<ImageView>(R.id.dice1)
        val diceImg2 = findViewById<ImageView>(R.id.dice2)
        val diceImg3 = findViewById<ImageView>(R.id.dice3)

        btn.setOnClickListener {

            val random1 = Random.nextInt(1, 6)
            val random2 = Random.nextInt(1, 6)
            val random3 = Random.nextInt(1, 6)

            Log.d("Random1", random1.toString())
            Log.d("Random2", random2.toString())
            Log.d("Random3", random3.toString())

            if (random1 == 1) {
                diceImg1.setImageResource(R.drawable.dice_1)
            } else if (random1 == 2) {
                diceImg1.setImageResource(R.drawable.dice_2)
            } else if (random1 == 3) {
                diceImg1.setImageResource(R.drawable.dice_3)
            } else if (random1 == 4) {
                diceImg1.setImageResource(R.drawable.dice_4)
            } else if (random1 == 5) {
                diceImg1.setImageResource(R.drawable.dice_5)
            } else {
                diceImg1.setImageResource(R.drawable.dice_6)
            }

            if (random2 == 1) {
                diceImg2.setImageResource(R.drawable.dice_1)
            } else if (random2 == 2) {
                diceImg2.setImageResource(R.drawable.dice_2)
            } else if (random2 == 3) {
                diceImg2.setImageResource(R.drawable.dice_3)
            } else if (random2 == 4) {
                diceImg2.setImageResource(R.drawable.dice_4)
            } else if (random2 == 5) {
                diceImg2.setImageResource(R.drawable.dice_5)
            } else {
                diceImg2.setImageResource(R.drawable.dice_6)
            }

            if (random3 == 1) {
                diceImg3.setImageResource(R.drawable.dice_1)
            } else if (random3 == 2) {
                diceImg3.setImageResource(R.drawable.dice_2)
            } else if (random3 == 3) {
                diceImg3.setImageResource(R.drawable.dice_3)
            } else if (random3 == 4) {
                diceImg3.setImageResource(R.drawable.dice_4)
            } else if (random3 == 5) {
                diceImg3.setImageResource(R.drawable.dice_5)
            } else {
                diceImg3.setImageResource(R.drawable.dice_6)
            }
        }
    }
}