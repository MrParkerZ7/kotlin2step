package kotlincode.simplecode.inheritance

fun main(args: Array<String>) {

    var john = Human()
    john.think()

    var park: Human = Programmer()
    park.think()
}

// All class in kotlin always final class revers with java.
open class Human {

    // All function in kotlin always final function too. like class
    open fun think() {
        println("Human: Life")
    }
}

class Programmer : Human() {

    override fun think() {
        println("Programmer: Code")
    }
}