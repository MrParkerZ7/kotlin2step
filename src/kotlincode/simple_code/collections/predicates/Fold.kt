package kotlincode.simple_code.collections.predicates

fun main(args: Array<String>) {
    var clan = listOf(
            Character("Park", 49, 7),
            Character("Thor", 70, 1),
            Character("Loki", 69, 6),
            Character("Odin", 89, 10))

    var demo = listOf(2, 3).fold(2, { partProduct, element -> element * partProduct })

    println(demo)

    // TODO: continue your .fold

}

private data class Clan(var member: List<Character>, var ranking: Int, var style: String)
private data class Character(var name: String, var level: Int, var skill: Int)