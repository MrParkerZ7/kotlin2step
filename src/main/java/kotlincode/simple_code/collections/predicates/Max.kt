package kotlincode.simple_code.collections.predicates

/**
 * Return one object inside array which biggest where ...
 */

fun main(args: Array<String>) {

    val teamA: MutableList<Motor> = mutableListOf(Sport("zx10r", 1000), Turing("gs1200", 1200), Cross("Duke", 750))
    val teamB: MutableList<Motor> = mutableListOf(Sport("r6", 600), Turing("500x", 500), Cross("Monster", 821), Sport("s1000rr", 1000))

    val rankA = mutableListOf<Ranking>(Ranking(2300, 289), Ranking(3700, 321), Ranking(2700, 307))
    val rankB = mutableListOf<Ranking>(Ranking(1700, 270), Ranking(2900, 302), Ranking(2800, 306))

    var guild: MutableList<RaceField> = mutableListOf(RaceField(teamA, rankA), RaceField(teamB, rankB))

    var validateOne = guild.maxBy { it.team.size }
    println("BiggestMember: $validateOne")

    var validateTwo = rankA.maxBy { it.topSpeed }
    println("BestTopSpeed TameA: $validateTwo")

}

private data class RaceField(var team: List<Motor>, var ranking: List<Ranking>)
private data class Ranking(var score: Int, var topSpeed: Int)
private interface Motor
private data class Sport(var model: String, var cc: Int) : Motor
private data class Turing(var model: String, var cc: Int) : Motor
private data class Cross(var model: String, var cc: Int) : Motor
