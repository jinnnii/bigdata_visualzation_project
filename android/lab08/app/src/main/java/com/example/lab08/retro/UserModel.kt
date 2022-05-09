package com.example.lab08.retro

import com.google.gson.annotations.SerializedName

data class UserModel (
    var id:String,
    @SerializedName("first_name")
    var firstName:String,
    @SerializedName("second_name")
    var secondName:String,
    var avatar:String,
    var avatarBitmap:String
    )