package kotlincode.simple_code.Conventions.Inheritance.Ab_stract

fun main(args: Array<String>) {
    var park: Human = Killer()
    park.think()
    park.talk()

    var jet: Human = Victim()
    jet.think()
    jet.talk()
}

private abstract class Human {
    abstract fun think()

    fun talk() {
        println("Talk about life.")
    }
}

private class Killer : Human() {
    override fun think() {
        println("Killer: need some victim.")
    }
}

private class Victim : Human() {
    override fun think() {
        println("Victim: how can I survive.")
    }
}

//If you not override Function from super class that subclass must be abstract class.
private abstract class Spector : Human() {
    fun warp() {
        println("Spector: warping.")
    }
}

