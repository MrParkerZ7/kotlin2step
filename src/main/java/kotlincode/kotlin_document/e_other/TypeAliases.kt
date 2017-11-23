package kotlincode.kotlin_document.e_other

fun main(args: Array<String>) {
    sampleOne()
}

typealias Motor = Motorcycle.Kawasaki
class Motorcycle {
    inner class Kawasaki {
        fun topSpeed() {
            println(400)
        }
    }
}

typealias Car = SuperCar.Lamborghini
class SuperCar {
    inner class Lamborghini {
        fun topSpeed() {
            println(350)
        }
    }
}

private fun sampleOne() {
    val f: (Int) -> Boolean = { it > 0 }
    println(foo(f)) // prints "true"

    val p: Predicate<Int> = { it > 0 }
    println(listOf(1, -2).filter(p)) // prints "[1]"
}

typealias Predicate<T> = (T) -> Boolean

fun foo(p: Predicate<Int>) = p(42)
