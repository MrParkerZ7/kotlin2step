package kotlincode.simplecode.backtick

fun main(args: Array<String>) {
    // 2. when we call we need to put that name into backtick too.
    `fun`("FUCK YOU!!")
}

// 1. The backtick we use it to define a name which it had the same name with keyword in kotlin
fun `fun`(speak: String) {
    println("This is a backtick: $speak")
}