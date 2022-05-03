package com.example.lab07.test3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.lab07.R
import com.example.lab07.databinding.ActivityTest32Binding

class Test32Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTest32Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnB.setOnClickListener{
            finish()
        }

        Log.d("test32Activity","onCreate")
    }

    override  fun onStart(){
        super.onStart()
        Log.d("test32Activity","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("test32Activity","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("test32Activity","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("test32Activity","onStop")
    }

    // 앱 종료시 발생
    override fun onDestroy() {
        super.onDestroy()
        Log.d("test32Activity","onDestroy")
    }
}