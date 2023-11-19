package com.example.framelayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class TableLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tablelayout)
    }

    fun btnChangeActivity(view: View){
        val btn = view as Button
        val intent: Intent = Intent(this@TableLayout, MainActivity::class.java)
        startActivity(intent)
    }
}