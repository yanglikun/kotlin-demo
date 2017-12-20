package com.github.yanglikun

import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    println("hello,world!")
    val format = SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Date());
    println(format)
    println(format.javaClass)
}
