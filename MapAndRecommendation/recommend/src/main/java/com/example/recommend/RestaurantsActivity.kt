package com.example.recommend

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.recommend.databinding.ActivityRestaurantsBinding

class RestaurantsActivity : AppCompatActivity() {
    lateinit var binding: ActivityRestaurantsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRestaurantsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // 추가
        var myWebView: WebView = findViewById(R.id.webviewAttractions)
        myWebView.webViewClient = WebViewClient()
        myWebView.loadUrl("https://english.visitseoul.net/restaurants/")
    }
}