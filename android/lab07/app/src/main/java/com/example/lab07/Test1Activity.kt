package com.example.lab07

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import com.example.lab07.databinding.ActivityTest1Binding

class Test1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTest1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val requestLauncher:ActivityResultLauncher<Intent> = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()){
            val resultData=it.data?.getStringExtra("resultData")
            binding.tvMainResult.text="result:$resultData"
        }

        binding.startBtn.setOnClickListener {
            val intent=Intent(this, DetailActivity::class.java)
            intent.putExtra("name","홍길동")
            intent.putExtra("age",10)
            requestLauncher.launch(intent)

        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==10&& resultCode== Activity.RESULT_OK){
            val result=data?.getStringExtra("resultData")
        }
    }
}
