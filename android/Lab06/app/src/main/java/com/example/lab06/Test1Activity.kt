package com.example.lab06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab06.databinding.ActivityTest1Binding

class Test1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityTest1Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        setSupportActionBar(binding)
    }
}