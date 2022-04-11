package com.example.lib.bbb

val data1 : Int=10
val data2=20
// val data3        최상위에서 변수 초기화를 안할 시, 오류 발생

lateinit var name:String //초기값을 안주고 싶은 경우 사용
//lateinit var age:Int !기본 데이터형을 제외한 객체형이면서 값을 바꿀 수 있는 것만 가능
//lateinit val major:String 원래부터 초기값이 설정되어있어야 함

class Member{
    //클래스 내 멤버변수 또한 초기값을 넣어주어야 함
    //var age:Int
    //var name:String

    var age :Int =10
    var name:String ="홍길동"
}
val data4 by lazy {
    println("in lazy...")
    10
}

fun main(){
    val data3:Int
    //val data4 데이터 형 지정 필수

    println("data1:$data1")
    println("data2:$data2")

    data3=5
    println("data:$data3")

    println(data4)
    println(data4)
}