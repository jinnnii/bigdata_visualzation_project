package com.example.mypetwalk

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mypetwalk.databinding.ActivityInputImageBinding
import com.example.mypetwalk.model.Image
import com.google.firebase.storage.FirebaseStorage
import java.text.SimpleDateFormat
import java.util.*

class InputImageActivity : AppCompatActivity() {
    lateinit var binding:ActivityInputImageBinding
    lateinit var storage:FirebaseStorage

    val IMAGE_PICK=1111
    var selectImage:Uri?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityInputImageBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        storage = FirebaseStorage.getInstance()
        binding.putImageBtn.setOnClickListener {
            if (selectImage!=null) {//이미 이미지가 업로드 되어있는 경우
                //파일 이름 설정
                var fileName = SimpleDateFormat("yyyyMMddHHmmss").format(Date())
                //firebase 업로드 위치
                storage.getReference().child("image").child(fileName)
                    .putFile(selectImage!!)
                    .addOnSuccessListener {
                        taskSnapshot-> //업로드 정보 담기
                        taskSnapshot.metadata?.reference?.downloadUrl?.addOnSuccessListener {
                            it->
                            var imageUrl = it.toString()
                            var image = Image(imageUrl)
//                            fire
                        }
                    }
            }
        }

    }
}