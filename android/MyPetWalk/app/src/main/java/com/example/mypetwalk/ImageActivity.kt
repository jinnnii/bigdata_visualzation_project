package com.example.mypetwalk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mypetwalk.databinding.ActivityImageBinding
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference

class ImageActivity : AppCompatActivity() {
    lateinit var binding:ActivityImageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mStorageRef:StorageReference

        mStorageRef=FirebaseStorage.getInstance().getReference()

    }
}