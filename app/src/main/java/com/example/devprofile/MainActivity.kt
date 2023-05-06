package com.example.devprofile

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.logo)
        val rounded = RoundedBitmapDrawableFactory.create(resources, bitmap)
        rounded.cornerRadius = 15f
        val logos = findViewById<ImageView>(R.id.lego)
        logos.setImageDrawable(rounded)
    }
}