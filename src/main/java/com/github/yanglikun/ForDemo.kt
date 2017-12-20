package com.github.yanglikun


fun main(args: Array<String>) {
    val arr = arrayOf("a", "b", "c")
    for (ele in arr) {
        print("$ele,")
    }
    println()
    for (i in arr.indices) {
        print("$i,")
    }
    println()
    for ((i, ele) in arr.withIndex()) {
        print("$i->$ele,")
    }
    println()
    for(i in 1..10){
        print( "$i,")
    }

}