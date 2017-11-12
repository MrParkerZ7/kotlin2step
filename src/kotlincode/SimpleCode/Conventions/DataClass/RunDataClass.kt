package kotlincode.SimpleCode.Conventions.DataClass

/**
 * Data have 3 thing for your class data
 * - toString()
 * - equals & hashCode
 * - copy() // for clone object
 */

fun main(args: Array<String>) {
    var park = Human(name = "Park", age = 23, skill = "Kotlin")
    var mark = Human(name = "Park", age = 23, skill = "Kotlin")
    var micro = park.copy(name = "Micro", money = 50_000)

    println(park == mark)
    println(micro)
}

private data class Human(var name: String? = null, var age: Int? = null, var skill: String? = null, var money: Int? = null) {

    fun say() {
        println("Human: my life is so shite!")
    }
}