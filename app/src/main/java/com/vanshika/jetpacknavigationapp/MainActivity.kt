package com.vanshika.jetpacknavigationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vanshika.jetpacknavigationapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding : ActivityMainBinding ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}