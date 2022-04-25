package com.example.lab01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab01.databinding.ActivityMessengerBinding

class MessengerActivity : AppCompatActivity() {
    lateinit var binding:ActivityMessengerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMessengerBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}