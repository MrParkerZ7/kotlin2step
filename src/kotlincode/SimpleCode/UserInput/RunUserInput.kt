package kotlincode.SimpleCode.UserInput

import java.util.*

fun main(args: Array<String>) {
    shrink()
}

// had some problem
private fun full() {
    var inn = Scanner(System.`in`)
    var say = inn.nextInt()
    println(inn)
}

private fun shrink() {
    var say = readLine()
    println(say)
}