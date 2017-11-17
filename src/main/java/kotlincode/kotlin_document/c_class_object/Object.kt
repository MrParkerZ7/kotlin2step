package kotlincode.kotlin_document.c_class_object

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import javax.swing.JComponent

fun main(args: Array<String>) {
    objValueFunction()

}

open class A(x: Int) {
    public open val y: Int = x
}

interface B

val ab: A = object : A(1), B {
    override val y = 15
}

fun objValueFunction() {
    val personal = object {
        var x: Int = 7
        var y: Int = 4
    }

    println("ResultPersonal: " + (personal.x + personal.y))
}

fun countClicks(window: JComponent) {
    var clickCount = 0
    var enterCount = 0

    window.addMouseListener(object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent) {
            clickCount++
        }

        override fun mouseEntered(e: MouseEvent) {
            enterCount++
        }
    })
    // ...
}