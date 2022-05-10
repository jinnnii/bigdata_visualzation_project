package com.example.lab07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.lab07.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name=intent.getStringExtra("name")
        val age=intent.getIntExtra("age",0)
        binding.tvResult.text="결과:$name,$age"

        binding.finishBtn.setOnClickListener {
            intent.putExtra("resultData","DetailActivity Result")
            setResult(RESULT_OK,intent)
            finish()
        }


    }
}