package com.project.firebasetest

import android.Manifest
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.project.firebasetest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    //firebase auth : 파이어베이스 인증
    lateinit var mFirebaseAuth: FirebaseAuth
    //실시간 데이터베이스
    lateinit var mDatabaseRef: DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        mFirebaseAuth= FirebaseAuth.getInstance()
        mDatabaseRef= FirebaseDatabase.getInstance().getReference("userlist")

        //로그아웃
        binding.logoutBtn.setOnClickListener {
            mFirebaseAuth.signOut()

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        //todo 탈퇴를 할 경우 !!
        //mFirebaseAuth.currentUser?.delete()

        binding.imageBtn.setOnClickListener {
            val intent = Intent(this, InputPhotoActivity::class.java)
            startActivity(intent)
        }
    }

}