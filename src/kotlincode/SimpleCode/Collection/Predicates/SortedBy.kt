package kotlincode.SimpleCode.Collection.Predicates

fun main(args: Array<String>) {

    sorted() // Use for common array
    sortedBy() // Use for else condition big data and object

}

private fun sorted() {

    val str = listOf("Park", "Anna", "Loki", "Thor", "Maria", "Mass", "Conner", "John")
    val num = listOf(50, 47, 94, 12, 66, 32, 45, 48, 99, 1, 267, 13)
    val strSort = str.sorted()
    val numSort = num.sorted()

    println(strSort)
    println(numSort)
}

private fun sortedBy() {
    var client: List<Alien> = listOf(
            Alien("Park", 23, 50, listOf(Item("Katana", 199), Item("Camera", 20_000), Item("Note book", 30_000)), (listOf(50, 62, 52))),
            Alien("Mark", 32, 4500, listOf(Item("Phone", 25_000), Item("Server", 100_000)), listOf(190, 300, 129, 645, 123)),
            Alien("Thor", 3500, 0, listOf(Item("Hammer", 79000)), listOf(11, 9, 10, 7, 6, 5)))

    val validateAge = client.sortedBy { it.age }
    val validateMoney = client.sortedBy { it.money }
    val validateScoreTime = client.sortedBy { it.score.size }
    val validateName = client.sortedBy { it.name }

    println()

    for (v in validateAge)
        println("Age: $v")
    for (v in validateMoney)
        println("Money: $v")
    for (v in validateScoreTime)
        println("ScoreTime: $v")
    for (v in validateName)
        println("Name: $v")
}

private data class Alien(var name: String, var age: Int, var money: Int, var item: List<Item>, var score: List<Int>)
private data class Item(var name: String, var price: Int)