package kotlincode.kotlin_document.d_function_lambdas

fun main(args: Array<String>) {
//    variableWithLambdas()
//    functionWithLambdas()
//    anonymousFunction()
    functionLiteralsReceiver()
}

fun functionLiteralsReceiver() {
    // extensions function
    var sum = fun Int.(value: Int): Int = this + value
    var multi = fun Int.(value: Int): Int = this * value

    println("Multi: ${3.multi(2)}")

    val represents: String.(Int) -> Boolean = { other -> toIntOrNull() == other }
    println("123".represents(123)) // true

    fun testOperation(op: (String, Int) -> Boolean, a: String, b: Int, c: Boolean) = assert(op(a, b) == c)

    println(testOperation(represents, "100", 100, true)) // OK
}

private fun functionWithLambdas() {
    fun makeMathFunc(num1: Int): (Int) -> Int = { num2 -> num1 * num2 }
    val multi = makeMathFunc(3)
    println(multi(5))
}


private fun variableWithLambdas() {
    var bmi = { weight: Float, height: Float -> weight / (height * 2) }
    println("My BMI : ${bmi(62f, 1.78f)}")

    val sum: (Int, Int) -> Int = { x, y -> x + y }
    println("SumResult: " + sum(5, 6))

    val fullName: (String, String, String) -> String = { nick, first, last -> "FullName: $nick $first $last" }
    println("MyFullName: ${fullName("Park", "Promsawat", "Pitakmetakul")}")
}

private fun anonymousFunction() {
    fun sum(a: Int, b: Int) = a * b
    println("Sum: " + sum(2, 3))

    fun multiple(a: Int, b: Int): Int {
        return a * b
    }
    println("Multi: ${multiple(2, 4)}")

    val list = listOf(4, 5, 2, 1, 3)
    val listFilter = list.filterNot { it == 5 }
    println("Result: $listFilter")
}