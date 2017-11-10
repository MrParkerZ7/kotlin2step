package kotlincode.simplecode.in_terface

/**
 * The concept of interface inheritance it's just like as in java language.
 */

fun main(args: Array<String>) {
    var jinny = Child()
    jinny.iq()
    jinny.hair()
    jinny.skin()
    jinny.tall()
}

interface Father {
    fun iq() {
        println("Father: iq 125")
    }

    fun tall() {
        println("Father: 180 cm.")
    }
}

interface Mather {
    fun iq() {
        println("Mather: iq 130")
    }

    fun skin()
    fun hair() {
        println("Mather: Red")
    }
}

class Child : Father, Mather {
    override fun iq() {
        println("Child: iq 145")
    }

    override fun skin() {
        println("Child: Orange")
    }
}