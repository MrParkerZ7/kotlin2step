package kotlincode.simplecode.userinput

import java.util.*

fun main(args: Array<String>) {
    shrink()
}

// had some problem
fun full() {
    var inn = Scanner(System.`in`)
    var say = inn.nextInt()
    println(inn)
}

fun shrink() {
    var say = readLine()
    println(say)
}