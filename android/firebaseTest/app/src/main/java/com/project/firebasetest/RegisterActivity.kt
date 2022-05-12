package com.project.firebasetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.project.firebasetest.databinding.ActivityRegisterBinding
import com.project.firebasetest.model.UserModel

class RegisterActivity : AppCompatActivity() {
    lateinit var binding:ActivityRegisterBinding

    //firebase auth : 파이어베이스 인증
    lateinit var mFirebaseAuth:FirebaseAuth

    //실시간 데이터베이스
    lateinit var mDatabaseRef:DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegisterBinding.inflate(layoutInflater)

        //회원가입 입력필드
        val mEditEmail:EditText =binding.edEmail
        val mEditPass:EditText = binding.edPassword
        val mEditNickname:EditText=binding.edNick
        val mRegisterBtn:Button = binding.regBtn


        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        mFirebaseAuth= FirebaseAuth.getInstance()
        mDatabaseRef=FirebaseDatabase.getInstance().getReference("userlist")

        mRegisterBtn.setOnClickListener {
            val email = mEditEmail.text.toString()
            val pass = mEditPass.text.toString()
            val nick = mEditNickname.text.toString()

            //firebase auth 진행
            // todo create : 사용자 등록
            mFirebaseAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(this){
                task->
                if(task.isSuccessful){
                    Log.d("pet","createUserWithEmail:success")
                    val firebaseUser: FirebaseUser? = mFirebaseAuth.currentUser
                    val account = UserModel(
                        uid = firebaseUser?.uid,
                        emailId = email,
                        password = pass,
                        nick =nick
                    )

                    //setValue : database insert
                    mDatabaseRef.child("UserAccount").child(firebaseUser?.uid.toString()).setValue(account)

                    Toast.makeText(baseContext, "회원가입 성공!", Toast.LENGTH_SHORT).show()

                }else{
                    Log.d("pet","createUserWithEmail:failure", task.exception)
                    Toast.makeText(baseContext,"Authentication failed",
                    Toast.LENGTH_SHORT).show()
                }
            }
        }

    }
}