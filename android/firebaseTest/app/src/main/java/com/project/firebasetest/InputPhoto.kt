package com.project.firebasetest

import android.Manifest
import android.content.pm.PackageManager
import android.media.Image
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.firebase.storage.FirebaseStorage
import com.project.firebasetest.databinding.ActivityInputPhotoBinding
import java.text.SimpleDateFormat
import java.util.*

class InputPhoto : AppCompatActivity() {
    lateinit var binding:ActivityInputPhotoBinding
    lateinit var storage: FirebaseStorage

    val IMAGE_PICK=1111
    var selectImage: Uri?=null

    private var launcher = registerForActivityResult(ActivityResultContracts.GetContent()) {
            it-> changeFragment(GalleryFragment(it))
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityInputPhotoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // 갤러리 접근 허용 메시지, 허용 시 앱이 설치되어있는 동안 유지
        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE),1)



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

        /**
         *  이미지 업로드 버튼 클릭
         */
        binding.putImageBtn.setOnClickListener {
            if (ContextCompat.checkSelfPermission(this@InputPhoto.applicationContext,
                    android.Manifest.permission.READ_EXTERNAL_STORAGE)== PackageManager.PERMISSION_GRANTED) {
                launcher.launch("image/**")  //갤러리로 이동하는 런처 실행.
            } else {    //앱이 갤러리에 접근햐는 것을 허용하지 않았을 경우
                Toast.makeText(this@InputPhoto,
                    "갤러리 접근 권한이 거부돼 있습니다. 설정에서 접근을 허용해 주세요.",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }



}