package com.example.mypetwalk.model

import java.util.*

data class Image (
    var id:Long?=null,
    var imageUrl:String="",
    var regdate:Date= Date()

)