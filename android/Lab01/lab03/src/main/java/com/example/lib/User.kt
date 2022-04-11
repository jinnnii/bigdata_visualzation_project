package com.example.lib

import java.text.SimpleDateFormat
import java.util.*

var data1 = 10 //값 변경 가능
val data2 = 20 //값 변경 불가

fun formatDate(date: Date):String{
    val sdformat = SimpleDateFormat("yyyy-MM-dd")
    return sdformat.format(date)
}

class User {
    var name="hello"
    fun sayHello(){

    }
}