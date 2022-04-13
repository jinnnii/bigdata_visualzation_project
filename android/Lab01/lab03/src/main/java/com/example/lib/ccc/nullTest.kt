package com.example.lib.ccc

fun main() {
    var data:String?=null
    data= "today is sunny"
    val length=if(data==null){
        println("this is null")
        0
    }else{
        println("this is not null")
        data.length
    }

    println("data length is $length")


    var data2:String?=null
    println("data length is ${data2?.length?:0}")

    var data3:String?="not null string"
//    var length2 = data3.length >>> error!
    var length2 = data3?.length


    var data4:String?="park"
    println("data4 : ${data4?.length?:-1}")
    data4=null
    println("data4 : ${data4?.length?:-1}")

    println(some("park"))
    println(some(null)) //예외 발생
}

fun some(data:String?):Int{
    return data!!.length
}