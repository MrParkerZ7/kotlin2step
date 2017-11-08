package kotlincode.simplecode.variable

/**
 * " val " is a final variable in java language.
 * It can't be chang again after initial value.
 */

fun main(args: Array<String>) {
    val name: String = "Park"
//    name = "Fuck!!" // If you uncomment this line you will get the error because val will not allow you to assign the value again
    println("Hello $name")
}