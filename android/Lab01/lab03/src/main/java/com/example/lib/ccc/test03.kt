package com.example.lib.ccc

fun main(){
//    배열 == 정적
    val arr1:Array<Int> = Array(3,{0})
    var arr2:IntArray=IntArray(3,{0})
    var arr3 = intArrayOf(1,2,3)
    var arr4 = booleanArrayOf(true,true,false)
    var arr5 = doubleArrayOf(3.5, 3.6, 3.7)

    for (i in 0..arr3.size-1){
        println("arr3[${i}] :${arr3[i]}")
    }


    arr1[0]=10
    arr1[1]=20
    arr1.set(2,30)
//    arr1.set(3,40)
    println("arr1 size : ${arr1.size}")
    println("arr1 data : ${arr1[0]}, ${arr1.get(1)}, ${arr1[2]}")


}