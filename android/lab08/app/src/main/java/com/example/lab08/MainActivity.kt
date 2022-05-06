package com.example.lab08

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.FileProvider
import com.example.lab08.databinding.ActivityMainBinding
import java.io.File
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var filePath:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val requestGalleryLauncher=registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ){

            try {
                val calRatio=calculateInSampleSize(
                    it.data!!.data!!,
                    resources.getDimensionPixelSize(R.dimen.imgSize),
                    resources.getDimensionPixelSize(R.dimen.imgSize)
                )

                val option=BitmapFactory.Options()
                option.inSampleSize=calRatio
                var inputStream=contentResolver.openInputStream(it.data!!.data!!)
                val bitmap=BitmapFactory.decodeStream(inputStream,null,option)
                inputStream!!.close()
                inputStream=null
                bitmap?.let {
                    binding.imageView.setImageBitmap(bitmap)
                }?:let{//null 이라면
                    Log.d("kej","bitmap null")
                }
            }catch (e:Exception){
                e.printStackTrace()
            }
        }
        binding.galleryBtn.setOnClickListener{
            // 전체 이미지 목록을 보여줌
            val intent= Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            // 이미지 타입 설정 (모든 이미지)
            intent.type="image/*"
            requestGalleryLauncher.launch(intent)
        }

        val requestCameraFileLauncher = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ){
            val calRatio = calculateInSampleSize(
                Uri.fromFile(File(filePath)),
                resources.getDimensionPixelSize(R.dimen.imgSize),
                resources.getDimensionPixelSize(R.dimen.imgSize)
            )
            val option=BitmapFactory.Options()
            option.inSampleSize=calRatio
            val bitmap = BitmapFactory.decodeFile(filePath,option)
            bitmap?.let{
                binding.imageView.setImageBitmap(bitmap)
            }
        }
        binding.cameraBtn.setOnClickListener{
            //파일 이름
            val timeStamp:String=SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            //디렉토리
            val storageDir:File?=getExternalFilesDir(Environment.DIRECTORY_PICTURES)

            //파일 생성
            val file=File.createTempFile(
                "JPEG_${timeStamp}_",
                ".jpg",
                storageDir
            )

            filePath=file.absolutePath
            val photoUri:Uri=FileProvider.getUriForFile(
                this,
                "com.example.lab08.fileprovider",
                file
            )
            val intent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            intent.putExtra(MediaStore.EXTRA_OUTPUT,photoUri)
            requestCameraFileLauncher.launch(intent)
        }

    }

    private fun calculateInSampleSize(fileUri: Uri,reqWidth:Int,reqHeight:Int):Int{
        val options=BitmapFactory.Options()
        options.inJustDecodeBounds=true
        try {
            var inputStream = contentResolver.openInputStream(fileUri)
            BitmapFactory.decodeStream(inputStream,null,options)
            inputStream!!.close() //null 있으면 무조건 오류 발생
        }catch (e:Exception){
            e.printStackTrace()
        }

        //정해놓은 사이즈 까지 이미지축소
        val(height:Int, width:Int) = options.run {
            outHeight to outWidth
        }
        var inSampleSize = 1
        if(height>reqHeight || width>reqWidth){
            val halfHeight:Int=height/2
            val halfWidth:Int = width/2
            while(halfHeight/inSampleSize>=reqHeight && halfWidth/inSampleSize>=reqHeight){
                inSampleSize *=2
            }
        }
        return inSampleSize //비율(몇배 나눠야하는지) 반환
    }
}