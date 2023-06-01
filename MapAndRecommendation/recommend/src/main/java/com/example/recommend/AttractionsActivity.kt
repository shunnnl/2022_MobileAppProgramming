package com.example.recommend

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import com.example.recommend.databinding.ActivityAttractionsBinding
import com.example.recommend.databinding.ActivityMainBinding

class AttractionsActivity : AppCompatActivity() {
    lateinit var binding: ActivityAttractionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAttractionsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // 추가
        var myWebView: WebView = findViewById(R.id.webviewAttractions)
        myWebView.webViewClient = WebViewClient()
        myWebView.loadUrl("https://english.visitseoul.net/attractions/")
    }
}