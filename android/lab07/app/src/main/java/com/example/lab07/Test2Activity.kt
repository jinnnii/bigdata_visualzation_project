package com.example.lab07

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.URLUtil
import com.example.lab07.databinding.ActivityTest2Binding

class Test2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTest2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.websiteBtn.setOnClickListener{
//            val intent = Intent()

            //1. 페이지 이동
//            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
//            intent.action=Intent.ACTION_VIEW
//            intent.data= Uri.parse("https://www.google.com/")


            //2. 다른 어플 이동
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.77,127.41"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}