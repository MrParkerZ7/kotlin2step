package kotlincode.SimpleCode.Conventions.KotlinWithJava.model

fun main(args: Array<String>) {
    var murderer = Murderer()
    murderer.name = "Kotlin"
    murderer.subject = "Killer"
    println("Kotlin: $murderer")

    var victim = Victim()
    victim.name = "Java"
    victim.subject = "Coding"
    println("Java: $victim")
}