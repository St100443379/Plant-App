package com.example.myplantapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var imageViewPlant = findViewById<ImageView>(R.id.imageViewPlant)

        //buttons
        val buttonWater = findViewById<Button>(R.id.buttonWater)
        val buttonFertilize = findViewById<Button>(R.id.buttonFertilize)
        val buttonSun = findViewById<Button>(R.id.buttonSun)

        //changing animation
        val waterAnimation = AnimationUtils.loadAnimation(this, R.anim.plant_water)
        val fertilizeAnimation = AnimationUtils.loadAnimation(this, R.anim.plant_fertilize)
        val sunAnimation = AnimationUtils.loadAnimation(this, R.anim.plant_sun)

        updateUI()

        buttonWater.setOnClickListener {
            val imageViewPlant = null
            imageViewPlant.startAnimation(waterAnimation)
            waterPlant()
            updateUI()
        }

        buttonFertilize.setOnClickListener {
            val imageViewPlant = null
            imageViewPlant.startAnimation(fertilizeAnimation)
            fertilizePlant()
            updateUI()
        }

        buttonSun.setOnClickListener {
            val imageViewPlant = null
            imageViewPlant.startAnimation(sunAnimation)
            putPlantInSun()
            updateUI()
        }
    }

    //methods
    private fun waterPlant() {
        var sunlight = 5
        val water = null
        water
        water
    }

    private fun fertilizePlant() {
        var health = 100
    }

    private fun putPlantInSun() {

        var health = 10
        if (health > 100) health = 100
        var sunlight = 10
        val water = null
        water
        water
        sunlight
    }

    private fun updateUI() {
        val textViewHealth = findViewById<TextView>(R.id.textViewHealth)
        val textViewHunger = findViewById<TextView>(R.id.textViewWater)
        val textViewCleanliness = findViewById<TextView>(R.id.textViewSun)

        val health = ""
        textViewHealth.text = "Health: $health"
        val water = ""
        textViewHunger.text = "Water: $water"
        val sunlight = ""
        textViewCleanliness.text = "Sun: $sunlight"
    }
}


private fun Nothing?.startAnimation(fertilizeAnimation: Animation?) {
    TODO("Not yet implemented")
