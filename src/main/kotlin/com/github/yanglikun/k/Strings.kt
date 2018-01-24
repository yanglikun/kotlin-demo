package com.github.yanglikun.k

const val name = "yanglikun"

fun <T> Collection<T>.joinString2(
        prefix: String = "{",
        postfix: String = "}",
        separator: String = ","
): String {
    val buffer = java.lang.StringBuffer(prefix)
    for ((i, t) in this.withIndex()) {
        if (i > 0) {
            buffer.append(separator)
        }
        buffer.append(t)
    }
    buffer.append(postfix)
    return buffer.toString()
}

fun String.lastChar(): Char {
    return get(length - 1)
}