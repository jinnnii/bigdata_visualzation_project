package com.project.firebasetest.model

/**
 * 사용자 계정 정보 모델 클래스
 */
data class UserModel(
    val uid: String?, //파이어베이스 uid(고유토큰정보)
    var emailId:String,
    var password:String,
    var nick:String
)