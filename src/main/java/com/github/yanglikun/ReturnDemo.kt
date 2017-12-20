package com.github.yanglikun

fun returnDemo_1() {
    println("begin-1")
    val intArray = intArrayOf(1, 2, 3, 4)
    intArray.forEach {
        if (it == 3) return
        println(it)
    }
    println("end-1")
}

fun returnDemo_2() {
    println("begin-2")
    val intArray = intArrayOf(1, 2, 3, 4)
    intArray.forEach(fun(a: Int) {
        if (a == 3) return
        println(a)
    })
    println("end-2")
}

fun main(args: Array<String>) {
    returnDemo_1()

    println("========")

    returnDemo_2()

    println("=========")
    fun sum(a: Int, b: Int) = a + b
    fun max(a: Int, b: Int) = if (a > b) a else b

    println(sum(1, 2))
    println(max(1, 2))

    val sum1 = fun(a: Int, b: Int) = a + b

    println("sum1::class=" + sum1::class)
    println("sum1(1, 2)=" + sum1(1, 2))

    val sum2 = fun(a: Int, b: Int) {
        a + b
    }

    fun sumf(a: Int, b: Int) = { a + b }

    println("sum2::class=" + sum2::class)//=class com.github.yanglikun.ReturnDemoKt$main$sum2$1 (Kotlin reflection is not available)
    println("sum2(1, 2)=" + sum2(1, 2))//sum2(1, 2)=kotlin.Unit
    println("sumf(1, 1)=" + sumf(1, 1))//sumf(1, 1)=Function0<java.lang.Integer>
    println("sumf(1, 1).invoke()=" + sumf(1, 1).invoke())

}