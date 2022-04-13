package com.example.lib.ccc

fun main(){
   whenTest03()
}

fun whenTest01(){
    var data =10
    when (data){
        10-> println("data is 10")
        20-> println("data is 10")
        30-> println("data is 10")
        else->{
            println("data is not valid data")
        }

    }
}

fun whenTest02(){
    var data:Any=10
    when(data){
        is String-> println("data is String")
        20,30-> println("data is 20 or 30")
        in 1..10-> println("data is in 1..10")
        else-> println("data is not valid")
    }
}

fun whenTest03(){
    var data=10
    val result=when{
        data<=0->"data is<=10"
        data>100->"data is >100"
        else->"data is valid"
    }
    println(result)
}

