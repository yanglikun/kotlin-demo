package com.github.yanglikun

class VariableVSValue {
    fun declareVar() {
        var a = 1
        a = 2
        println(a)
        println(a::class)
        println(a::class.java)
        var x = 5
        x += 1
        println("x=$x")
    }

    fun declareVal() {
        val b = "a"
//        b = "b"
        println(b)
        println(b::class)
        println(b::class.java)
        val c: Int = 1
        val d = 2
        val e: Int
        e = 3
        println("c=$c,d=$d,e=$e")
    }
}

fun main(args: Array<String>) {
    VariableVSValue().declareVar()
    print("==========")
    VariableVSValue().declareVal()
}