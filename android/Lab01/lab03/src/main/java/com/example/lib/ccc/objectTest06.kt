package com.example.lib.ccc

var g_publicData=100
private var g_privateData=200

open class Super1{
    var publicData = 10
    protected  var protectedData = 20
    private var privateData = 30
}

class Sub1:Super1(){
    fun subFun(){
        publicData++
        protectedData++
//        privateData++

        g_publicData++
        g_privateData++
    }
}