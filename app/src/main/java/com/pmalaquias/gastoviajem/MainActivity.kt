package com.pmalaquias.gastoviajem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pmalaquias.gastoviajem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun calculate(){

    }
}