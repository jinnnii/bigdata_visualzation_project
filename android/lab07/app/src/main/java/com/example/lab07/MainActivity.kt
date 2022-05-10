package com.example.lab07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab07.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.homeBtn.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("name","홍길동")
            intent.putExtra("age",10)
            startActivityForResult(intent,100)
        }

    }
}