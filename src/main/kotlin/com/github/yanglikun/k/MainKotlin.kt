import com.github.yanglikun.Person
import com.github.yanglikun.k.Button
import com.github.yanglikun.k.View
import com.github.yanglikun.k.joinString2
import com.github.yanglikun.k.lastChar

fun View.showOff() = println("view showOff")
fun Button.showOff() = println("button showOff")

fun main(args: Array<String>) {
    var view: View = Button()
    view.click()
    view.showOff()
}