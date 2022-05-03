package com.example.lab07.test3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.example.lab07.R
import com.example.lab07.databinding.ActivityTest31Binding

class Test31Activity : AppCompatActivity() {
    var count:Int =0
    lateinit var binding:ActivityTest31Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTest31Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnA.setOnClickListener{
            val intent = Intent(this,Test32Activity::class.java)
            startActivity(intent)
        }

        binding.btnCount.setOnClickListener{
            count++
            binding.tvCount.text=count.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        outState.putInt("count",count)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val data = savedInstanceState.getInt("count")
        binding.tvCount.text=count.toString()
        count=data
    }
}