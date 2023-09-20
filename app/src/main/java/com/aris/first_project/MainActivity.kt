package com.aris.first_project

import   androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count = 0
        val id1 = findViewById<Button>(R.id.BTN1)
        val id2 = findViewById<TextView>(R.id.TV1)
        id1.setOnClickListener{
            count++
            id2.text = count.toString()
        }

    }
}
