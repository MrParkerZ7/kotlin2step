package kotlincode.kotlin_document.e_other

fun main(args: Array<String>) {
    var (name, age, sex) = Person("Park", 23, Sex.Male)
    println("$name : $age : $sex")

    var (dailyWages, partTime) = reward(15)
    println("$dailyWages : $partTime")

}

private fun reward(workedTime: Int): Reward = Reward((workedTime / 8) * 1_000, (workedTime % 8) * 300)

// Destructuring in object manner
private class Reward(var dailyWages: Int? = null, var partTime: Int? = null) {
    operator fun component1(): Int? = dailyWages
    operator fun component2(): Int? = partTime
}

private class Person(var name: String, var age: Int, var sex: Sex) {
    operator fun component1(): String = name
    operator fun component2(): Int = age
    operator fun component3(): Sex = sex
}

private enum class Sex {
    Male, Female
}

