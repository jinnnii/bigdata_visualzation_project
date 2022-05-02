package com.example.lab05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab05.databinding.ActivityToolbarBinding

class ToolbarActivity : AppCompatActivity() {
    lateinit var binding:ActivityToolbarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityToolbarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
    }
}