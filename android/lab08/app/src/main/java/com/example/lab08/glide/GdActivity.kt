package com.example.lab08.glide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.lab08.R
import com.example.lab08.databinding.ActivityGdBinding

class GdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityGdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setContentView(binding.root)

        val url="https://ssl.pstatic.net/mimgnews/image/144/2022/05/09/0000811659_001_20220509133101282.jpg?type=w540"
        Glide.with(this)
            .load(url)
            .override(500,500)
            .placeholder(R.drawable.roading)
            .error(R.drawable.ww)
            .into(binding.imageView2)
    }
}