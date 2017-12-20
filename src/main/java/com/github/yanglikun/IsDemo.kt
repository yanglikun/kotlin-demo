package com.github.yanglikun

fun test(obj: Any): Int? {
    var result=0
    if(obj is String){
        println(obj::class)
        println(obj::class.java)
        result=obj.length
    }
    println(obj::class)
    println(obj::class.java)
    return 1
}

fun main(args: Array<String>) {
    val obj = "a"
    test(obj)
}