package test

import com.github.a.Bird
import com.github.a.what
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class PackageDemoTest {

    @Test
    fun testWhat() {
        com.github.a.what();
    }

    @Test
    fun testBirdFly() {
        val bird = Bird()
        bird.fly()
    }
}