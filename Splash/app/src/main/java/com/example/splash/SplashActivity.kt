package com.example.splash


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.splash.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    lateinit var binding : ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // run gif function.
        showGIF()

        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
            finish()
        },DURATION)

    }
    companion object {
        private const val DURATION : Long = 4000
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

    // add code to animate gif image.
    fun showGIF() {
        val imageView:ImageView = findViewById(R.id.hatch)
        Glide.with(this).load(R.drawable.hatch).into(imageView)
    }

}


