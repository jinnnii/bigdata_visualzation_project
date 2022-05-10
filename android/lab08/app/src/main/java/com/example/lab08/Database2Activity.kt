package com.example.lab08

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab08.databinding.ActivityDatabase2Binding
import java.io.IOException

class Database2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityDatabase2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnWrite.setOnClickListener{
            var outFile = openFileOutput("text1.txt", Context.MODE_APPEND)
            var str= binding.edInput.text.toString()
            outFile.write(str.toByteArray())
            outFile.close()
        }
        binding.btnRead.setOnClickListener{
            try{
                var inputFile = openFileInput("text1.txt")
                var txt = ByteArray(inputFile.available())
                inputFile.read(txt)
                inputFile.close()
                var str= txt.toString(Charsets.UTF_8)
                binding.tvRead.setText(str)

            }catch (e:IOException){
                binding.tvRead.setText("파일없음")
            }
        }

    }
}