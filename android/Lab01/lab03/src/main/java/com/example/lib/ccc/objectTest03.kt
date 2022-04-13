package com.example.lib.ccc

class Student(var name:String){

    init {
        println("name : $name")
    }
    constructor(name:String, count:Int):this(name){
        //주 생성자가 생성
        println("name : $name, count:$count")
    }
    constructor(name:String, count:Int, email:String):this(name,count){
        println("name : $name, count:$count, email:$email")
    }

    fun sumFun(){
//        println("name:$name, count:$count email:$email")
    }
}

fun main() {
    val student1 = Student("홍길동")
    println("===================================")
    val student2 = Student("홍길동",25)
    println("===================================")
    val student3 = Student("홍길동",25,"hong@naver.com")

    student1.sumFun()
    student2.sumFun()
    student3.sumFun()

}