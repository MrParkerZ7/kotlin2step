package kotlincode.SimpleCode.Backtick

fun main(args: Array<String>) {
    // 2. when we call we need to put that name into Backtick too.
    `fun`("FUCK YOU!!")
}

// 1. The Backtick we use it to define a name which it had the same name with keyword in kotlin
private fun `fun`(speak: String) {
    println("This is a Backtick: $speak")
}