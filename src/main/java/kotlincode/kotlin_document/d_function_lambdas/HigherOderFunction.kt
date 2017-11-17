package kotlincode.kotlin_document.d_function_lambdas

fun main(args: Array<String>) {

    // Impl interface into parameter
    implInterfaceIntoParameter(object : Human {
        override fun showName(s: String) {
            println("MyName: $s")
        }
    })

    // Method with lambda into parameter
    putMethodIntoParameter(25_000, { result: Int -> println("Salary + Bonus : $result") })
    putMethodIntoParameter(27_000) { result: Int -> println("Salary + Bonus (2) : $result") }

    // Variable method into parameter
    val sala = { salary: Int -> println("Variable: $salary") }
    putMethodIntoParameter(30_000, sala)

    // Closures in kotlin we can reassign value of variable from method lambda function.
    var salaryResult = 0
    putMethodIntoParameter(45_000, { salary: Int -> salaryResult = salary })
    println("Closures: " + salaryResult)

    // "it" in lambda anonymous function. it referent to single parameter of method. which mean it allow with single parameter method only.
    putMethodIntoParameter(12_000, { println("Lambda It: $it") })

}


private fun putMethodIntoParameter(salary: Int, bonus: (Int) -> Unit) {
    bonus((salary * 1.4).toInt())
}

private fun implInterfaceIntoParameter(show: Human) {
    show.showName("Park")
}

interface Human {
    fun showName(s: String)
}