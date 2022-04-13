package com.example.lib.ccc

class User(var name:String, var count:Int){
    //var name:String
    //var count:Int

//    init {
//        this.name=name
//        this.count=count
//        println("init >>> name=$name, count=$count")
//    }

    fun sumFun(){
        println("sumFun >>> name=$name, count:$count")
    }
}

fun main() {
    val user= User("홍길동",22)
//    val user2 =User()
    user.sumFun()
}