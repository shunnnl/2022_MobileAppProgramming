package com.example.metro_noapi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SelectActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select)

        val line1button = findViewById<Button>(R.id.Button1)
        line1button.setOnClickListener({
            val intent = Intent(this, Line1Activity::class.java)
            startActivity(intent)
        })

        val line2button = findViewById<Button>(R.id.Button2)
        line2button.setOnClickListener({
            val intent = Intent(this, Line2Activity::class.java)
            startActivity(intent)
        })

        val line3button = findViewById<Button>(R.id.Button3)
        line3button.setOnClickListener({
            val intent = Intent(this, Line3Activity::class.java)
            startActivity(intent)
        })

        val line4button = findViewById<Button>(R.id.Button4)
        line4button.setOnClickListener({
            val intent = Intent(this, Line4Activity::class.java)
            startActivity(intent)
        })

        val line5button = findViewById<Button>(R.id.Button5)
        line5button.setOnClickListener({
            val intent = Intent(this, Line5Activity::class.java)
            startActivity(intent)
        })

        val line6button = findViewById<Button>(R.id.Button6)
        line6button.setOnClickListener({
            val intent = Intent(this, Line6Activity::class.java)
            startActivity(intent)
        })

        val line7button = findViewById<Button>(R.id.Button7)
        line7button.setOnClickListener({
            val intent = Intent(this, Line7Activity::class.java)
            startActivity(intent)
        })

        val line8button = findViewById<Button>(R.id.Button8)
        line8button.setOnClickListener({
            val intent = Intent(this, Line8Activity::class.java)
            startActivity(intent)
        })

        val line9button = findViewById<Button>(R.id.Button9)
        line9button.setOnClickListener({
            val intent = Intent(this, Line9Activity::class.java)
            startActivity(intent)
        })


    }
}