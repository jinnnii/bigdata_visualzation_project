package com.example.lib.ccc

open class Super{
    open var someData=10
    open fun superFun(){
        println("i am superFun : $someData")
    }
}

class Sub:Super(){
    override var someData=20
    override fun superFun() {
        super.superFun()
        println("i am sub class function : $someData")
    }
}

fun main() {
    val obj = Sub()
    obj.someData=30
    obj.superFun()
}