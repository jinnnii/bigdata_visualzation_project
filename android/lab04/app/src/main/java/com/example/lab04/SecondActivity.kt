package com.example.lab04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val invisible = findViewById<Button>(R.id.invisible)
        val visible = findViewById<Button>(R.id.visible)
        val imgView = findViewById<ImageView>(R.id.imgView)
        invisible.setOnClickListener{
            imgView.visibility = View.INVISIBLE
        }

        visible.setOnClickListener{
            imgView.visibility = View.VISIBLE
        }
    }


}

