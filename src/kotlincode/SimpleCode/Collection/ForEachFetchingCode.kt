package kotlincode.SimpleCode.collection

import java.util.function.Consumer

fun main(args: Array<String>) {

//    consumerFullManner()
    consumerShrinkManner()
}

private fun consumerShrinkManner() {
    var model = mutableListOf<Motorbike>(Motorbike("Kawasaki", 1000), Motorbike("BMW", 1000))

//    model.forEach({ m -> print(m) })
//    model.forEach({ println(it) })
    model.forEach(::println)
}

private fun consumerFullManner() {
    var model = mutableListOf<Motorbike>(Motorbike("Kawasaki", 1000), Motorbike("BMW", 1000))

    var con: Consumer<Motorbike> = object : Consumer<Motorbike> {
        override fun accept(t: Motorbike) {
            println("Brand: ${t.brand} CC: ${t.cc}")
        }

    }

    model.forEach(con)
}

private data class Motorbike(var brand: String, var cc: Int)

