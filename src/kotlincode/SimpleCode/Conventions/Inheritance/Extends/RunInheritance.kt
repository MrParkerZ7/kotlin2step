package kotlincode.SimpleCode.Conventions.Inheritance.Extends

fun main(args: Array<String>) {

    var john = Human()
    john.think()

    var park: Human = Programmer()
    park.think()
}

// All class in kotlin always final class revers with java.
private open class Human {

    // All Function in kotlin always final Function too. like class
    open fun think() {
        println("Human: Life")
    }
}

private class Programmer : Human() {

    override fun think() {
        println("Programmer: Code")
    }
}