package com.github.yanglikun

class WhenDemo {

    fun test(obj: Any) {
        when (obj) {
            1 -> println("数字1")
            "hello" -> println("字符串hello")
            !is String -> println("不是字符串类型")
            else -> println("默认分支")
        }
    }

    fun test1(obj: Any) {
        when (obj) {
            1, "hello" -> println("数字1")//多个条件在一起用逗号
            !is String -> println("不是字符串类型")
            else -> println("默认分支")
        }
    }
}

fun main(args: Array<String>) {
    WhenDemo().test(1)
    WhenDemo().test("hello")
    WhenDemo().test(true)
}