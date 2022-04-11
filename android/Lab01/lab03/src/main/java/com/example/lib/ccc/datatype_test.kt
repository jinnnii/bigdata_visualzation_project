package com.example.lib.ccc

var data1:Int=10
var data2:Int?=null

val a1:Byte = 0b00001010
val a2:Double=5.5
val a3:Float=10.4f
val a4:Long = 10L
val a5:Boolean = true
val a6:Char ='A'

val str1="hello"
val str2="""
    hello
    world
    kotlin
"""

fun someFun(){
    data1=data1+1
    data2=data1+1
    data2=data1.plus(10)

    println(data1)
    println(data2)
}

fun main(){
    println("a1: $a1")
    println("a2: $a2")
    println("a3: $a3")
    println("a4: $a4")
    println("a5: $a5")
    println("str1: $str1")
    println("str2: $str2")
    someFun()

}