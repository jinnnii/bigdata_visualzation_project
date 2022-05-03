package com.example.lab06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab06.databinding.ActivityTest4Binding

class Test4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityTest4Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.navBar.setNavigationItemSelectedListener {
            binding.tvResult.text="${it.title}"
            binding.drawer.closeDrawer(binding.navBar)
            true
        }
    }
}
