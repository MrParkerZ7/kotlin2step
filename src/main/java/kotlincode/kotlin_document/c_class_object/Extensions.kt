package kotlincode.kotlin_document.c_class_object

fun main(args: Array<String>) {
//    extensionFunction()
//    extendVsMember()
//    companionExtensions()

}

fun companionExtensions() {
    Car.wheel()
}

private class Car {
    companion object // Require if we want to extend companion function of variable.
}

private fun Car.Companion.wheel() { // Extended companion extension function
    println("Wheel: rolling")
}


private fun extendVsMember() {
    class ExtendVsMember {
        fun run() = println("Member: Nope!")
    }

    fun ExtendVsMember.run() = println("Extend: Run..")

    var ex = ExtendVsMember()
    ex.run()
}

private fun extensionFunction() {
    open class Ninja300
    class Ninja400 : Ninja300()

    fun Ninja300.motor() = println("CC: 300")
    fun Ninja400.motor() = println("CC: 400")

    var ninja = Ninja400()
    ninja.motor()
}




