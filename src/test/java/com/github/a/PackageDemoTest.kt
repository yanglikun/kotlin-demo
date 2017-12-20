package com.github.a

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class PackageDemoTest {

    @Test
    fun testWhat() {
        what();
    }

    @Test
    fun testBirdFly() {
        val bird = Bird()
        bird.fly()
    }
}