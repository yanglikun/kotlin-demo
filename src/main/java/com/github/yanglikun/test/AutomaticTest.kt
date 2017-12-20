package com.github.yanglikun.test

import java.io.File


fun foo(a: Int = 3, b: String = "rr") {
    println("$a,$b")
}

fun main(args: Array<String>) {
    val a: String? = null
    a?.let {
        println("not empty:" + it)
    }

    a ?: println("ump报警 this is empty")

}