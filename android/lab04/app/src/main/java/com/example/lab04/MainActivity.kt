package com.example.lab04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lab04.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addBtn.setOnClickListener{
            var num1 : Int = binding.num1.toString().toInt()
            var num2 : Int = binding.num2.toString().toInt()
            binding.result.setText("결과 : ${num1+num2}")
        }
    }
}