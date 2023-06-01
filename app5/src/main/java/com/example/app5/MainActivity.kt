package com.example.app5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.app5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 추가
        var myWebView: WebView = findViewById(R.id.mapview)
        myWebView.webViewClient = WebViewClient()
        val webSettings = myWebView.settings
        webSettings.javaScriptEnabled = true
        myWebView.loadUrl("https://www.google.co.kr/maps/?hl=en/")


        binding.translationBtn.setOnClickListener{
            val intent: Intent = Intent(this, TranslationActivity::class.java)
            startActivity(intent)
        }

        binding.subwayBtn.setOnClickListener{
            val intent: Intent = Intent(this, SubwayActivity::class.java)
            startActivity(intent)
        }

        binding.mapBtn.setOnClickListener{
            val intent: Intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
        }

        binding.recommendationBtn.setOnClickListener{
            val intent: Intent = Intent(this, RecommendationActivity::class.java)
            startActivity(intent)
        }

        binding.stampBtn.setOnClickListener{
            val intent: Intent = Intent(this, StampActivity::class.java)
            startActivity(intent)
        }

        binding.reservationBtn.setOnClickListener{
            val intent: Intent = Intent(this, ReservationActivity::class.java)
            startActivity(intent)
        }
    }
}