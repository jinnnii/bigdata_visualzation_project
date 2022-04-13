package com.example.lib.ccc

fun sum(no1:Int, no2:Int):Int {
    return no1 + no2
}
// 람다 : 익명 함수 정의 기법 (함수 이름이 없음)
//1. 매개변수가 있는 람다 함수
val sum1 = {no1:Int, no2:Int -> no1+no2}

//2. 매개변수가 없는 람다 함수
val print1 = {-> println("no parameter lambda with arrow")}
val print2 = { println("no parameter lambda")}

//3. 매개변수가 1개 + it 키워드사용
val print3: (Int)->Unit={ println(it)}

//4. 함수 타입 지정 (매개변수 타입 + 반환 타입)
val sum2 : (Int, Int)->Int={no1:Int, no2:Int -> no1+no2}

//5. 함수 타입 별칭
typealias MyInt = Int
typealias MyFunType = (Int, Int) -> Int

val data:MyInt = 10
val sum3 : MyFunType = {no1, no2 -> no1+no2} //타입 유추가 가능하다면 타입 선언 생략 가능

//6. 고차함수
//... 함수를 매개변수로 전달받거나 반환하는 함수

fun hofFun(arg:(Int)->Boolean):()->String{
    val result = if(arg(10)){
        "valid"
    }else {
        "invalid"
    }
    return {"hofFun result : $result"}
}

fun main() {
    val result = hofFun({ no->no>0 })
    println(result())
}