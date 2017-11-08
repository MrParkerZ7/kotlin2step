package kotlincode.simplecode.logic

/**
 * When just like switch in java
 */
fun main(args: Array<String>) {
    val value: Int = 5

    // common when
    when (value) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        5 -> println("Five")
        else -> println("Fuck!!")
    }

    // when with return value
    var str = when (value) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> println("PrintReturn: Five")
        else -> "Fuck You!!"
    }

    println("GetReturn: $str")

}