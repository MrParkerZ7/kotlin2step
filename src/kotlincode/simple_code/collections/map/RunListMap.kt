package kotlincode.simple_code.collections.map

import java.util.*

fun main(args: Array<String>) {
    var list = listOf("Park", "Micro", "John", "Box")
    for ((number, value) in list.withIndex())  // withIndex. That mean we will get int of sequent with value
        println("$number : $value")

    var member = TreeMap<Int, String>()
    member[0] = "Park"
    member[1] = "Bat"
    member[2] = "Sumar"

    for ((number, name) in member)
        println("$number : $name")
}