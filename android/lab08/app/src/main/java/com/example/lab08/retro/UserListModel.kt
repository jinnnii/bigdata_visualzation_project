package com.example.lab08.retro

import com.google.gson.annotations.SerializedName

data class UserListModel(
    var page:String,
    @SerializedName("per_page")
    var perPage:String,
    var total:String,
    @SerializedName("total_page")
    var totalPage:String,
    var data:List<UserModel>)