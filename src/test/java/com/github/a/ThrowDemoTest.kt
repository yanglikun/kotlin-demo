package com.github.a

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import java.lang.IllegalArgumentException

fun throwDemo1() {
    throw IllegalArgumentException("非法参数")
}

@RunWith(JUnit4::class)
class ThrowDemoTest {

    @Test
    fun test1() {
        throwDemo1()
    }

    @Test
    fun test2() {
        val e: Nothing = throw RuntimeException("哦哦~~")
        println("e=" + e)
    }

}
