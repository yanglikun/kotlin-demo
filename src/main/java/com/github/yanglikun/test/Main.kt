package com.github.yanglikun.test

import java.awt.Graphics
import java.awt.Shape
import java.awt.event.ActionListener
import javax.naming.Context
import javax.swing.text.Element
import javax.swing.text.Position
import javax.swing.text.View

fun parseInt(a: String): Int? {
    return a.toIntOrNull()
}

fun printProduct(a: String, b: String) {
    val x = parseInt(a)
    val y = parseInt(b)

    if (x != null && y != null) {
        println(x * y)
    } else {
        println("either '$a' or '$b' is not a number")
    }
}

fun main(args: Array<String>) {

    open class Base {
        open val x: Int = 3
    }

    class SubBase : Base() {
        override var x: Int = 4
    }

    class Test {
        val x: Int
            get() {
                return 3
            }
    }

    val base = SubBase();
    println(base.x)
    base.x = 44;
    println(base.x)

}

