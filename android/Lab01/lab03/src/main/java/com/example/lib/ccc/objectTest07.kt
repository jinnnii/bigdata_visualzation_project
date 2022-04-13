package com.example.lib.ccc

class NonDataClass(var name:String, var age:Int){

}

data class DataClass(var name:String, var age:Int){
    //주 생성자만 가능
}

data class DataClass2(var name:String, var age:Int){
    // 주 생성자만 가능
//    constructor(val name:String, val age:Int)
    lateinit var email:String

    constructor(name:String, age:Int, email:String):this(name,age){
        this.email=email
    }
}


fun main() {
    g_publicData++
//    g_privateData++

    var obj = Sub1()
    obj.publicData++
//    obj.protectData++
//    obj.privateData++

    var non1 = NonDataClass("홍길동",10)
    var non2 = NonDataClass("홍길동",10)
    var data1 = DataClass("홍길동",10)
    var data2 = DataClass("홍길동",10)



    println("non data class equals : ${non1.equals(non2)}")
    println("data class equals : ${data1.equals(data2)}")

    var data3 = DataClass2("홍길동", 10, "aaaaa@naver.com")
    var data4 = DataClass2("홍길동", 10, "bbbbb@naver.com")

    println("data class equals with constructor : !!!!! ${data3.equals(data4)} !!!!! >>> but not equals email (${data3.email}) != (${data4.email})")

    println("non data toString : ${non1.toString()}")
    println("data toString : ${data3.toString()}")
}