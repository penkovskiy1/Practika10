package com.example.framelayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("TableLayout")

    }

    var status: Boolean = true
    fun Click(view: View){
        val btn: Button = findViewById(R.id.button1)
        val btn2: Button = findViewById(R.id.button2)
        if (status == true) {
            btn.visibility = View.INVISIBLE
            btn2.visibility = View.VISIBLE
            status = false
        }
        else {
            btn.visibility = View.VISIBLE
            btn2.visibility = View.INVISIBLE
            status = true
        }
    }

    fun btnChangeActivity(view: View){
        val btn = view as Button
        val intent: Intent = Intent(this@MainActivity, LinearLayout::class.java)
        startActivity(intent)
    }
}