package com.example.recommend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recommend.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgBtnTouristAttractions.setOnClickListener{
            val intent: Intent = Intent(this, AttractionsActivity::class.java)
            startActivity(intent)
        }

        binding.imgBtnFamousRestaurants.setOnClickListener{
            val intent: Intent = Intent(this, RestaurantsActivity::class.java)
            startActivity(intent)
        }

    }
}