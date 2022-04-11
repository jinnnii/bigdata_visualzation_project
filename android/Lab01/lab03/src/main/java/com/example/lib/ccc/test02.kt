package com.example.lib.ccc

fun main(){
    fun some(data1:Int, data2:Int=5):Int{
        return data1*data2
    }

    println(some(10,20))
    println(some(10))
    println(some(data2=5, data1=3))
}