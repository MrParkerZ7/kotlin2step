package kotlincode.SimpleCode.Collections.Predicates

/**
 * ".flatMap" Use to fetch value inside array of all object. And put it all in single List<> and return
 */

fun main(args: Array<String>) {

    var groupA: MutableList<Animate> = mutableListOf(Human("Park", 24), Elf("Mark", 29), God("Thor", 350), Demon("Loki", 250))
    var groupB: MutableList<Animate> = mutableListOf(Human("Maria", 27), Elf("Troll", 150), God("Iden", 35), Demon("Hulk", 45))

    var guild: MutableList<Guild> = mutableListOf(Guild(groupA, "Killer"), Guild(groupB, "Supporter"))
    var validate = guild.flatMap { it.species.toSet() } // .toSet or not it return in collection manner already

    validate.forEach(::println)
}

private data class Guild(var species: List<Animate>, var style: String)
private interface Animate
private data class Human(var name: String, var age: Int) : Animate
private data class Elf(var name: String, var age: Int) : Animate
private data class Demon(var name: String, var age: Int) : Animate
private data class God(var name: String, var age: Int) : Animate