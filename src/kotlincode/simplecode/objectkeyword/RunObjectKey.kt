package kotlincode.simplecode.objectkeyword

fun main(args: Array<String>) {
    Office.employee.add(Human("Park", 23))
    Office.employee.add(Human("Mora", 27, 70_000))
    Office.employee.add(Human("Rocky", 19, 1500))
    Office.employee.add(Human("Mix", 21, 500))

    Office.listOfEmployee()
}

data class Human(var name: String? = null, var age: Int? = null, var money: Int? = null)

object Office {
    var employee = arrayListOf<Human>()

    fun listOfEmployee() {
        for (e in employee)
            println(e)
    }
}