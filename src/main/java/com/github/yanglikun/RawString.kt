package com.github.yanglikun

fun main(args: Array<String>) {

    val rawString = """
    fun test(): String {
        return "aa"
    }
    """
    println(rawString)
    print("=====")
    println("$rawString 's length is ${rawString.length}")

}