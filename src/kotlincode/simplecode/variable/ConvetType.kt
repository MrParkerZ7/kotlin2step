package kotlincode.simplecode.variable

/**
 * Primitive data type
 * byte
 * boolean
 * char
 * short
 * int
 * float
 * long
 * double
 */

fun main(args: Array<String>) {

    var valueA = "5"
    println(valueA)

    var valueB = valueA.toInt()
    println(valueB)

    var valueC = true
    println(!valueC)

    var valueD = 50.55
    println(valueD)
}
