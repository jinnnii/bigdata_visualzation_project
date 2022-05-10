package com.example.lab06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab06.databinding.ActivityFloatBinding

class FloatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityFloatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.extendFab.setOnClickListener{
            binding.tvResultFloat.text="aaaa"
        }
    }
}