package com.example.lab06

import android.os.Bundle
import android.os.SystemClock
import androidx.appcompat.app.AppCompatActivity
import com.example.lab06.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var initTime = 0L
    var pauseTime = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {
            binding.chronometer.base=SystemClock.elapsedRealtime()+pauseTime
            binding.chronometer.start()
            binding.btnStart.isEnabled=false
            binding.btnReset.isEnabled=true
            binding.btnStop.isEnabled=true
        }
        binding.btnStop.setOnClickListener {
            pauseTime=binding.chronometer.base-SystemClock.elapsedRealtime()
            binding.chronometer.stop()
            binding.btnStart.isEnabled=true
            binding.btnReset.isEnabled=true
            binding.btnStop.isEnabled=false
        }

        binding.btnReset.setOnClickListener {
            pauseTime=0L
            binding.chronometer.base=SystemClock.elapsedRealtime()
            binding.chronometer.stop()
            binding.btnStart.isEnabled=true
            binding.btnReset.isEnabled=false
            binding.btnStop.isEnabled=false
        }
    }

}