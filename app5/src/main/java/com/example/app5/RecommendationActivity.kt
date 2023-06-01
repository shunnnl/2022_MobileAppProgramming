package com.example.app5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app5.databinding.ActivityMainBinding
import com.example.app5.databinding.ActivityRecommendationBinding
import com.example.recommend.AttractionsActivity
import com.example.recommend.RestaurantsActivity

class RecommendationActivity : AppCompatActivity() {
    lateinit var binding: ActivityRecommendationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityRecommendationBinding.inflate(layoutInflater)
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