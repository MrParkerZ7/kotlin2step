package kotlincode.kotlin_document.d_function_lambdas

fun main(args: Array<String>) {
    variableLambdas()
    val multi = makeMathFunc(3)
    println(multi(5))
}

fun makeMathFunc(num1: Int): (Int) -> Int = { num2 -> num1 * num2 }

fun variableLambdas() {
    var bmi = { weight: Float, height: Float -> weight / (height * 2) }
    println("My BMI : ${bmi(62f, 1.78f)}")
}