package com.example.lab3.test01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.lab3.R

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        val button: Button = findViewById(R.id.btn1)
        button.setOnClickListener(View.OnClickListener {
            button.visibility=View.INVISIBLE
        })
    }
}