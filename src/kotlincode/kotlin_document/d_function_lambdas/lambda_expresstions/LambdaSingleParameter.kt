package kotlincode.kotlin_document.d_function_lambdas.lambda_expresstions

fun main(args: Array<String>) {

    var salary = 37_000
    var salaryBonus = calculatorBonus(Grade.C, { it: Grade -> (salary * it.grade).toInt() })
    println("Result Salary : $salaryBonus")
}

fun calculatorBonus(grade: Grade, calculate: (Grade) -> Int): Int = calculate(grade)


enum class Grade(var grade: Float) {
    A(1.5f), B(1.4f), C(1.3f), D(1.2f), E(1.1f), F(1f);
}