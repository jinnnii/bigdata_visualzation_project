package com.example.lib.ccc

fun main(){
    forTest04()
    forTest05()
}

fun forTest01(){
    var sum:Int=0
    for(i in 1..10){
        sum+=i
    }
    println("sum=$sum")
}

fun forTest02(){
    var sum:Int=0
    for(i in 10 downTo 1){
        sum+=i
    }
    println("sum=$sum")
}

fun forTest03(){
    var sum:Int=0
    for(i in 2..10 step 2){
        sum+=i
    }
    println("sum=$sum")
}

fun forTest04(){
    var data= arrayOf<Int>(10,20,30)
    for (i in data.indices){
        print(data[i])
        if(i!==data.size-1) print(", ")
    }
}

fun forTest05(){
    var data = intArrayOf(10,20,30)
    for((index,value) in data.withIndex()){
        print(value)
        if(index!=data.size-1) print(", ")
    }
}