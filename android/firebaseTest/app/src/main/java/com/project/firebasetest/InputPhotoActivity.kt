package com.project.firebasetest

import android.Manifest
import android.content.ContentResolver
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.webkit.MimeTypeMap
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import com.project.firebasetest.databinding.ActivityInputPhotoBinding
import com.project.firebasetest.model.ImageModel
import java.util.*
import kotlin.collections.ArrayList

class InputPhotoActivity : AppCompatActivity() {
    lateinit var binding:ActivityInputPhotoBinding

    //firebase storage : 파이어베이스 이미지 담는 storage
    lateinit var mFirebaseStorage: StorageReference
    //실시간 데이터베이스
    lateinit var mDatabaseRef: DatabaseReference

    val IMAGE_PICK=100
    var imageUri = arrayListOf<Uri>()

    lateinit var uploadBtn: Button
    lateinit var selectBtn:Button
    lateinit var imageView:ImageView

    private var launcher = registerForActivityResult(ActivityResultContracts.GetContent()) {
//            it-> changeFragment(GalleryFragment(it))
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityInputPhotoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // 갤러리 접근 허용 메시지, 허용 시 앱이 설치되어있는 동안 유지
        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE),1)

        mFirebaseStorage= FirebaseStorage.getInstance().getReference()
        mDatabaseRef= FirebaseDatabase.getInstance().getReference("image")

        uploadBtn= binding.uploadImageBtn
        selectBtn= binding.putImageBtn
        imageView = binding.imageView

        // todo 가져온 이미지 uri 삽입
        var activityResult:ActivityResultLauncher<Intent> =
            registerForActivityResult(
                ActivityResultContracts.StartActivityForResult()){
                    result->
                if (result.resultCode== RESULT_OK && result.data!=null){
                    imageUri.add(result.data!!.data!!)
                    imageView.setImageURI(imageUri.get(0))
                }
            }


        fun getFileExtension(uri:Uri):String?{
            val cr:ContentResolver = contentResolver
            val mime:MimeTypeMap = MimeTypeMap.getSingleton()

            return mime.getExtensionFromMimeType(cr.getType(uri))
        }


        //todo 파이어베이스 이미지 업로드
        fun uploadToFirebase(uriList:ArrayList<Uri>){
            val fileRef:StorageReference = mFirebaseStorage.child(
                System.currentTimeMillis().toString())

            val fileArray = mapOf<String, ImageModel>()
            for(uri in uriList){
                fileRef.putFile(uri).addOnSuccessListener {
                    //성공시
                    fileRef.downloadUrl.addOnSuccessListener {
                        //이미지 모델에 담기
                        val image = ImageModel(uri.toString())

                        //키로 아이디 생성
                        val imgId= mDatabaseRef.push().key

                        //데이터 삽입
//                        mDatabaseRef.child(imgId.toString()).setValue(image)
                        fileArray.plus(imgId.toString() to image)
//                        Toast.makeText(this, "업로드 성공!", Toast.LENGTH_SHORT).show()


                        //업로드 이후 알려줄 화면
                        imageView.setImageResource(R.drawable.ic_launcher_background)
                    }
                }.addOnProgressListener {
                    //프로그래스바
                }.addOnFailureListener{
                    //실패
                    Toast.makeText(this, "업로드 실패!", Toast.LENGTH_SHORT).show()
                    return@addOnFailureListener
                }

                for(file in fileArray){
//                    mDatabaseRef.child(file.key).setValue(file.value)
                    Log.d("pet",file.toString())
                }
            }

        }


        //todo 사진 가져오기 (select)
        selectBtn.setOnClickListener {
            val intent = Intent().setAction(Intent.ACTION_PICK).setType("image/*")
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
         *  이미지 등록 버튼 클릭
         */
        uploadBtn.setOnClickListener {
            if(imageUri.size!=0){
                uploadToFirebase(imageUri!!)
            }else{
                Toast.makeText(this@InputPhotoActivity,
                    "사진을 선택해 주세요",
                    Toast.LENGTH_SHORT).show()
            }
        }



    }

}