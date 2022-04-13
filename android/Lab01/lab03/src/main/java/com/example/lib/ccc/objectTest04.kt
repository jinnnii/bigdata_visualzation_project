package com.example.lib.ccc

open class Parent(name:String){
    init {
        println("prent >>> name:$name")
    }
}

class Child(name:String,count:Int):Parent(name){
    init {
        println("child >>> name:$name, count:$count")
    }
}

fun main() {
    val parent = Parent("홍길동")
    val child = Child("홍길동",25)

}