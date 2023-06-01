package com.example.app5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ApplicationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_application)

        //completion 버튼 클릭 시 정보 페이지로 이동
        val moveButton1 = findViewById<Button>(R.id.completion)
        moveButton1.setOnClickListener{
            val intent = Intent(this, CompletionActivity::class.java)
            startActivity(intent)
        }
    }
}