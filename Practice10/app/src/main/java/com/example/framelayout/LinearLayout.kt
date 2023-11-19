package com.example.framelayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class LinearLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linerlayout)
    }

    fun Click(view: View){
        val btn = view as Button
        var text1:TextView = findViewById(R.id.textView2)
        var text2:TextView = findViewById(R.id.textView4)
        when (btn.id){
            R.id.button1 -> text1.text = "Вертикальная"
            R.id.button2 -> text2.text = "По левой границе"
            R.id.button3 -> text1.text = "Горизонтальная"
            R.id.button4 -> text2.text = "По центру"
            R.id.button5 -> text1.text = "Вертикальная"
            R.id.button6 -> text2.text = "По правой границе"
        }
    }

    fun btnChangeActivity(view: View){
        val btn = view as Button
        val intent: Intent = Intent(this@LinearLayout, TableLayout::class.java)
        startActivity(intent)
    }
}