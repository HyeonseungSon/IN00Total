package com.hyeonseungson.in00total

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.hyeonseungson.in00total.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    /*
    Title 제거
    res\values\themes
    <item name="windowNoTitle">true</item>
     */

    /*
    Activity 실행 순서 변경
    app\manifests\AndroidManifest.xml
    <intent-filter> Tag 위치 변경하여 Activity 실행 순서 변경
     */

    /*
    색상 변경 미동작 조치방법
    res\values\themes
    <style name="Theme.Project_Name" parent="Theme.AppCompat.Light">
     */

    /*
    SplashActivity
    (1) SplashActivity, SplashActivity02
    Handler() 생성
    (2) activity_splash.xml, activity_splash02.xml
    View 생성
     */

    /*
    LinearLayout 수직 쌓기
    <android:orientation="vertical">
     */

    /*
    Click Event
    MainActivity : setOnClickListener 생성
     */

    /*
    Binding
    1. Gradle Scripts\build.gradle (Module: ProjectName.app)
    (1)
    dataBinding {
        enabled true
    }
    (2) Sync
    2. res\layout\activity_main.xml
    <layout> Tag 로 전체를 감쌉니다.
    3. MainActivity
    (1) private lateinit var binding : ActivityMainBinding 입력
    (2) binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    => 위치 유의
    (3)
    binding.testBtnId.setOnClickListener{
        Toast.makeText(this, "Click02", Toast.LENGTH_SHORT).show()
    }
     */

    // Binding 1단계
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Binding 2단계 (위치 변경 시, Menu01 ~ 05 실행 안됨)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val menu01 = findViewById<TextView>(R.id.menu01)
        val menu02 = findViewById<TextView>(R.id.menu02)
        val menu03 = findViewById<TextView>(R.id.menu03)
        val menu04 = findViewById<TextView>(R.id.menu04)
        val hello = findViewById<TextView>(R.id.Hello)
        val welcome = findViewById<TextView>(R.id.Welcome)
        val dice = findViewById<TextView>(R.id.dice)
        val listViewMenu = findViewById<TextView>(R.id.listView)
        val goodWords = findViewById<TextView>(R.id.GoodWords1)

        menu01.setOnClickListener {
            val intent = Intent (this, MenuInsideActivity::class.java)
            intent.putExtra("data", "1")
            startActivity(intent)
        }
        menu02.setOnClickListener {
            val intent = Intent (this, MenuInsideActivity::class.java)
            intent.putExtra("data", "2")
            startActivity(intent)
        }
        menu03.setOnClickListener {
            val intent = Intent (this, MenuInsideActivity::class.java)
            intent.putExtra("data", "3")
            startActivity(intent)
        }
        menu04.setOnClickListener {
            val intent = Intent (this, MenuInsideActivity::class.java)
            intent.putExtra("data", "4")
            startActivity(intent)
        }
        // Hello Toast Button
        hello.setOnClickListener {
            Toast.makeText(this, "Hello Korea", Toast.LENGTH_SHORT).show()
        }
        // Binding 3단계 : Welcome Toast Button
        binding.Welcome.setOnClickListener {
            Toast.makeText(this, "Welcome Korea", Toast.LENGTH_SHORT).show()
        }
        // 주사위
        dice.setOnClickListener {
            val intent = Intent (this, DiceActivity::class.java)
            startActivity(intent)
        }
        // List View
        listViewMenu.setOnClickListener {
            val intent = Intent (this, ListViewActivity::class.java)
            startActivity(intent)
        }
        // Good Words
        goodWords.setOnClickListener {
            val intent = Intent(this, GoodwordsActivity::class.java)
            startActivity(intent)
        }

        // Log Test
        for (item in 1..10 step 2) {
            Log.d("MainActivity", "item : $item")
        }

        Log.e("error", "오류")
        Log.w("warning", "경고")
        Log.i("information", "정보")
        Log.d("debug", "디버그")
        Log.v("view", "상세보기")

        Log.e("Test", "시험")
        Log.w("Test", "시험")
        Log.i("Test", "시험")
        Log.d("Test", "시험")
        Log.v("Test", "시험")
    }

    // 뒤로가기 Button
    private var isDouble = false

    override fun onBackPressed() {
        Log.d("Back Button", "뒤로가기 정상실행")

        if (isDouble == true) {
            finish()
        }

        isDouble = true
        Toast.makeText(this, "종료하시려면 더블클릭", Toast.LENGTH_SHORT).show()

        Handler().postDelayed( {
            isDouble = false
        }, 2000)
    }
}