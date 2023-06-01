package com.example.metro_noapi

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.metro_noapi.databinding.ActivityMainBinding
import com.opencsv.CSVReader
import java.io.InputStreamReader
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //노선도 버튼 누르면 노선도 화면 띄우도록 전환
        val mapbutton = findViewById<Button>(R.id.mButton)
        mapbutton.setOnClickListener({
            val intent = Intent(this, MmapActivity::class.java)
            startActivity(intent)
        })

        val selectbutton = findViewById<Button>(R.id.sButton)
        selectbutton.setOnClickListener({
            val intent = Intent(this, SelectActivity::class.java)
            startActivity(intent)
        })

        val linkbutton = findViewById<Button>(R.id.lButton)
        linkbutton.setOnClickListener({
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.seoulmetro.co.kr/kr/cyberStation.do?action=time#stationInfo"))
            startActivity(intent)
        })

        val assetManager = this.assets
        val inputStream = assetManager.open("전체 시간표.csv")

        val reader = CSVReader(InputStreamReader(inputStream))

        val allContent = reader.readAll()
        /*for (content in allContent) {
            Log.i("all", content.toList().toString())
        }*/

    }
}