package code.`object`

fun main(args: Array<String>) {
    var objOne = Human()
    objOne.name = "Park"
    objOne.skill = "Run Fast"

    println("Name: ${objOne.name}")
    println("Skill: ${objOne.skill}")
    println("Obj: $objOne")
}