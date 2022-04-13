package com.example.lib.ccc
open class Super3{
    open var data=10
    open fun some(){
        println("i am super some :$data")
    }
}
val obj = object:Super3() {
    override var data=20
    override fun some(){
        println("i am object some : $data")
    }
}



class MyClass{
    companion object{
        var data=10
        fun some(){
            println("companion object : $data")
        }
    }
}

fun main() {
    obj.data=30
    obj.some()

    MyClass.data=20
    MyClass.some()
}

