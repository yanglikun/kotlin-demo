package com.github.yanglikun

fun main(args: Array<String>) {
    println(max(1, 2))
}

fun max(a: Int, b: Int): Any? {
    return if (a > b) a else b
}

fun max1(a: Int, b: Int): Any? {
    var max = a
    if (b > a) {
        max = b
    }
    return max
}

fun max2(a: Int, b: Int): Any? {
    var max = if (b > a) {
        b
    } else {
        a
    }
    return max
}





