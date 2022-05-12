package com.project.firebasetest

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import com.project.firebasetest.databinding.ActivityInputPhotoBinding
import java.text.SimpleDateFormat
import java.util.*

class InputPhotoActivity : AppCompatActivity() {
    lateinit var binding:ActivityInputPhotoBinding

    //firebase storage : 파이어베이스 이미지 담는 storage
    lateinit var mFirebaseStorage: StorageReference
    //실시간 데이터베이스
    lateinit var mDatabaseRef: DatabaseReference

    val IMAGE_PICK=100
    var selectImage: Uri?=null

    private var launcher = registerForActivityResult(ActivityResultContracts.GetContent()) {
//            it-> changeFragment(GalleryFragment(it))
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityInputPhotoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // 갤러리 접근 허용 메시지, 허용 시 앱이 설치되어있는 동안 유지
        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE),1)

        mFirebaseStorage= FirebaseStorage.getInstance().getReference("images")
        mDatabaseRef= FirebaseDatabase.getInstance().getReference("images")


        binding.putImageBtn.setOnClickListener {
            val intent = Intent()
            intent.setAction(Intent.ACTION_PICK)
            intent.setType("image/*")
            activityResult.launch(intent)
            val galleryIntent= Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
            setResult(IMAGE_PICK, galleryIntent)



//            if (selectImage!=null) {//이미 이미지가 업로드 되어있는 경우
//                //파일 이름 설정
//                var fileName = SimpleDateFormat("yyyyMMddHHmmss").format(Date())
//                //firebase 업로드 위치
//                storage.getReference().child("image").child(fileName)
//                    .putFile(selectImage!!)
//                    .addOnSuccessListener {
//                            taskSnapshot-> //업로드 정보 담기
//                        taskSnapshot.metadata?.reference?.downloadUrl?.addOnSuccessListener {
//                                it->
////                            var imageUrl = it.toString()
////                            var image = Image(imageUrl)
//////                            fire
//                        }
//                    }
//            }
        }

        /**
         *  이미지 업로드 버튼 클릭
         */
        binding.putImageBtn.setOnClickListener {
            if (ContextCompat.checkSelfPermission(this@InputPhotoActivity.applicationContext,
                    android.Manifest.permission.READ_EXTERNAL_STORAGE)== PackageManager.PERMISSION_GRANTED) {
                launcher.launch("image/**")  //갤러리로 이동하는 런처 실행.
            } else {    //앱이 갤러리에 접근햐는 것을 허용하지 않았을 경우
                Toast.makeText(this@InputPhotoActivity,
                    "갤러리 접근 권한이 거부돼 있습니다. 설정에서 접근을 허용해 주세요.",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }


    


}