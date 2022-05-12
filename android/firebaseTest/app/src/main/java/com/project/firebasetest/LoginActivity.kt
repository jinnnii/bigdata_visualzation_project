package com.project.firebasetest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.project.firebasetest.databinding.ActivityLoginBinding
import com.project.firebasetest.model.UserModel

class LoginActivity : AppCompatActivity() {
    lateinit var binding:ActivityLoginBinding

    //firebase auth : 파이어베이스 인증
    lateinit var mFirebaseAuth: FirebaseAuth
    //실시간 데이터베이스
    lateinit var mDatabaseRef: DatabaseReference



    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val regBtn: Button =binding.joinBtn
        val loginBtn:Button = binding.loginBtn

        mFirebaseAuth= FirebaseAuth.getInstance()
        mDatabaseRef= FirebaseDatabase.getInstance().getReference("userlist")

        regBtn.setOnClickListener {
            //todo 회원가입 화면으로 이동
            val intent = Intent(this,RegisterActivity::class.java )
            startActivity(intent)
        }

        loginBtn.setOnClickListener {
            //todo 로그인 요청
            val email = binding.inputId.text.toString()
            val pass = binding.inputPass.text.toString()
            
            // todo sign in : 사용자 로그인
            mFirebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(this){
                    task->
                if(task.isSuccessful){
                    Log.d("pet","success!!")
                    //로그인 성공!
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish() // 현재 액티비티 종료
                }else{
                    Log.d("pet","failed!!",task.exception)
                    Toast.makeText(baseContext,"로그인 실패...",
                        Toast.LENGTH_SHORT).show()
//                    task.result
                }
            }

        }

    }
}