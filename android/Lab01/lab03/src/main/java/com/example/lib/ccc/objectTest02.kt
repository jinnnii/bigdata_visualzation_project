package com.example.lib.ccc

class Member {
    constructor()

    constructor(name:String){
        println("constructor >>> name:String call...")
    }
    constructor(name:String, count:Int){
        println("constructor >>> name:String, count:Int call...")
    }

}

fun main() {
    val member1 = Member()
    val member2 = Member("홍길동")
    val member3 = Member("홍길동",25)
}