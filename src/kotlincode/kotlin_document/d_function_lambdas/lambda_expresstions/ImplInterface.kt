package kotlincode.kotlin_document.d_function_lambdas.lambda_expresstions

fun main(args: Array<String>) {

    executor(object : Killer {
        override var ranking: Int = 1_500
        override var name: String = "Sam"
        override var countBody: Int = 55

        override fun killing() {
            countBody++
            ranking + 50
        }

        override fun showRanking() {
            println("Name $name : Rank $ranking : Count Body $countBody")
        }
    })

}

fun executor(killer: Killer) {
    killer.killing()
    killer.showRanking()

}

interface Killer {
    var ranking: Int
    var name: String
    var countBody: Int

    fun killing()
    fun showRanking()
}