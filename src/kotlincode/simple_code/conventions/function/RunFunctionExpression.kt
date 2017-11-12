package kotlincode.simple_code.Conventions.Function

fun main(args: Array<String>) {
    plus(5, 6)
    plusOneL(7, 4)
    println("FunEx: ${exPlus(2, 3)}")
    println("FunExOneL ${exPlusOneL(3, 7)}")
}

// Common Function like method in java
private fun plus(a: Int, b: Int) {
    println("Function ${a + b}")
}

// One line Function
fun plusOneL(a: Int, b: Int) = println("FunOneLine: ${a+b}")

// Common Function with expression
private fun exPlus(a: Int, b: Int): Int { // Colon and specify return type if you want it to return something
    if (a > b)
        return a
    else
        return b
}

// Function with expression in one line
private fun exPlusOneL(a: Int, b: Int): Int = if (a > b) a else b