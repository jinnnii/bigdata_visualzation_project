package com.example.lib.ccc

fun main(){
    var map = mapOf<String,String>(Pair("one","hello"), "two" to "world")
//    map.set("three","kotlin")
    println("${map.get("one")}, ${map["two"]}")

    var mutableMap = mutableMapOf<String,String>(Pair("one","hello"))
    mutableMap.put("two","world")

}