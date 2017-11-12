package kotlincode.SimpleCode.Collection.Predicates

fun main(args: Array<String>) {

    var people: List<Personal> = listOf(
            Personal("Park", 23, "Creator"),
            Personal("Conner", 37, "Programmer"),
            Personal("Thor", 3500, "God"),
            Personal("Loki", 2500, "Demon"),
            Personal("Hulk", 45, "Demon"),
            Personal("Hela", 4200, "God"),
            Personal("Mark", 29, "Programmer"),
            Personal("Odin", 6500, "God"))


    var groupJob = people.groupBy { it.job }
    for (p in groupJob)
        println("By Job: $p")
    println("Select Demon: ${groupJob.get("Demon")}")

    var groupGod = people.groupBy { it.job == "God" } // Using boolean
    for (p in groupGod)
        println("By God: $p")
    println("True God: ${groupGod.get(true)}")
}

private data class Personal(var name: String, var age: Int, var job: String)