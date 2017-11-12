package kotlincode.SimpleCode.Collection.Predicates

fun main(args: Array<String>) {

    val coins: BoxCoin = BoxCoin(
            satang = listOf(0.25f, 0.5f, 0.25f, 0.25f, 0.5f),
            bath = listOf(5, 10, 1, 1, 5, 2, 10, 2, 5, 1, 10, 10, 2, 2, 5, 1, 10))

    val satangCoin = coins.satang.sumByDouble { it.toDouble() }
    println("Total Satang: $satangCoin")

    val bathCoin = coins.bath.sum()
    println("Total Bath: $bathCoin")
}

private data class BoxCoin(var satang: List<Float>, var bath: List<Int>)