package com.example.lib.ccc

fun main(){
   ifTest02()
}

fun ifTest01(){
    var data=10
    if(data>0){
        println("data>0")
    }else{
        println("data<0")
    }
}

fun ifTest02(){ //표현식 : 결과를 반환하는 계산식
    var data=10
    val result = if(data>0){
        println("data>0")
        true //반환 값
    }else{
        println("data<0")
        false
    }
    println(result)
}