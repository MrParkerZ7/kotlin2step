package kotlincode.simple_code.collections.predicates

fun main(args: Array<String>) {

    var lava = listOf(
            Lava("Park", 23),
            Lava("Poke", 23),
            Lava("Thor", 55),
            Lava("Macro", 45),
            Lava("Mix", 23),
            Lava("Loki", 44))

    var count = lava.count { it.num == 23 } // Count when condition return boolean
    println(count)
}

private data class Lava(var name: String, var num: Int)