package kotlincode.kotlin_document.e_other

fun main(args: Array<String>) {
//    basic()
    referFromClass()
}

class Memer(var name: String, var no: Int) {
    fun showDetail() {
        println("$no : $name")
    }
}

fun referFromClass() {
    val p1 = Memer::showDetail
    val p2 = Memer::name

    println(p1)
    println(p2)

    val m = Memer("Macro", 203)
    val m1 = m::name
    val m2 = m::showDetail

    println(m1)
    println(m2)

    // Result bolt same.

}

var name = "Park"

private fun basic() {
    var takeValue = ::name.get()
    var takeName = ::name.name
    ::name.set("Fuck")

    println(takeValue)
    println(takeName)
    println(::name.get())
}