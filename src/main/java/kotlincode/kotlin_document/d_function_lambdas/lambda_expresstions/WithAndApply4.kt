package kotlincode.kotlin_document.d_function_lambdas.lambda_expresstions

fun main(args: Array<String>) {

    // with() {} which mean we can assign value inside without define identity
    var dante = Demon()
    with(dante) { name = "Dante";story = "Devil May Cry";color = Color.Red }
    dante.checkDemon()


    var wolfy = Demon()
    wolfy.apply { name = "Wolfy"; story = "Matal Gear : Revenger"; color = Color.Black }.checkDemon()
}


enum class Color {
    Red, Black, White, Green, Blue, Yellow

}

private data class Demon(var name: String? = null, var story: String? = null, var color: Color? = null) {
    companion object {
        fun num() {
            println("Static")
        }
    }

    fun checkDemon() = if (name != null && story != null && color != null) println("Demon: $name Ready!") else println("Demon: $name Not Ready!")

}