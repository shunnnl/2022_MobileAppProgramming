package com.example.app5

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.app5.MmapActivity
import com.example.app5.SelectActivity


class SubwayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subway)

        //노선도 버튼 누르면 노선도 화면 띄우도록 전환
        val mapbutton = findViewById<Button>(R.id.mButton)
        mapbutton.setOnClickListener {
            val intent = Intent(this, MmapActivity::class.java)
            startActivity(intent)
        }

        val selectbutton = findViewById<Button>(R.id.sButton)
        selectbutton.setOnClickListener {
            val intent = Intent(this, SelectActivity::class.java)
            startActivity(intent)
        }

        val linkbutton = findViewById<Button>(R.id.lButton)
        linkbutton.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("http://www.seoulmetro.co.kr/kr/cyberStation.do?action=time#stationInfo")
            )
            startActivity(intent)
        }

        val assetManager = this.assets


    }
}