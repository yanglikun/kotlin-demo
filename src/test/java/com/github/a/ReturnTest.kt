package com.github.a

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


fun returnDemo2() {
    println("begin")
    val intArrayOf = intArrayOf(1, 2, 3, 4)
    intArrayOf.forEach {
        if (it == 3) return
        println(it)
    }
    println("end")
}

fun returnDemo3() {
    println("begin")
    val intArrayOf = intArrayOf(1, 2, 3, 4)
    intArrayOf.forEach here@ {
        if (it == 3) return@here
        println(it)
    }
    println("end")
}

@RunWith(JUnit4::class)
class ReturnDemoTest {

    @Test
    fun testLabel() {
        returnDemo3()
    }

    @Test
    fun testWithoutLabel() {
        returnDemo2()
    }
}