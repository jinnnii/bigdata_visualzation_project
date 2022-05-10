package com.example.mypetwalk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mypetwalk.adapter.ImageAdapter
import com.example.mypetwalk.databinding.ActivityImageBinding
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference

class ImageActivity : AppCompatActivity() {
    lateinit var binding:ActivityImageBinding
    //파이어베이스 스토리지 레퍼런스
    lateinit var mStorageRef:StorageReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /**
         * 파이어베이스 연동하기
         */
        mStorageRef=FirebaseStorage.getInstance().getReference()
        val imateAdapter= ImageAdapter(this, ArrayList())
        val imageAdapter =ImageAdapter(this, imageList)


        /**
         * 이미지 추가 화면 이동
         */
        binding.tvReview.setOnClickListener{
            val intent= Intent(this, InputImageActivity::class.java)
            startActivity(intent)
        }

        /**
         * 
         */

    }
}