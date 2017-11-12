package kotlincode.SimpleCode.Conventions.Inheritance.In_terface

/**
 * The concept of interface Inheritance it's just like as in java language.
 */

fun main(args: Array<String>) {
    var jinny = Child()
    jinny.iq()
    jinny.hair()
    jinny.skin()
    jinny.tall()
}

private interface Father {
    fun iq() {
        println("Father: iq 125")
    }

    fun tall() {
        println("Father: 180 cm.")
    }
}

private interface Mather {
    fun iq() {
        println("Mather: iq 130")
    }

    fun skin()
    fun hair() {
        println("Mather: Red")
    }
}

private class Child : Father, Mather {
    override fun iq() {
        println("RunChild: iq 145")
    }

    override fun skin() {
        println("RunChild: Orange")
    }
}