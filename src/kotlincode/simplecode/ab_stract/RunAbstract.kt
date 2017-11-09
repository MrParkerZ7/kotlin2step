package kotlincode.simplecode.ab_stract

fun main(args: Array<String>) {
    var park: Human = Killer()
    park.think()
    park.talk()

    var jet: Human = Victim()
    jet.think()
    jet.talk()
}

abstract class Human {
    abstract fun think()

    fun talk() {
        println("Talk about life.")
    }
}

class Killer : Human() {
    override fun think() {
        println("Killer: need some victim.")
    }
}

class Victim : Human() {
    override fun think() {
        println("Victim: how can I survive.")
    }
}

//If you not override function from super class that subclass must be abstract class.
abstract class Spector : Human() {
    fun warp() {
        println("Spector: warping.")
    }
}

