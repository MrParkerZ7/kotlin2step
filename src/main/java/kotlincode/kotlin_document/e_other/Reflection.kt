package kotlincode.kotlin_document.e_other

fun main(args: Array<String>) {
    val c = MyClass::class
    val d = MyClass.Box::class

    println("MyClass: " + c)
    println("MyClass: " + c.constructors)
    println("MyClass: " + c.isInner)
    println("MyClass: " + c.nestedClasses)

    println("Box: " + d.isInner)
    println("Box: " + d.nestedClasses)

    whatItIs()

    fun length(s: String) = s.length

}

fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
    return { x -> f(g(x)) }
}

private fun whatItIs() {
    // TODO: What was this ?
    val aClass: MyClass = MyClass("4/1", "King")
    assert(aClass is ClassRoom) { println("Bad widget: ${aClass::class.qualifiedName}") }
}

interface ClassRoom {
    var name: String
    var type: String
}

class MyClass(override var name: String, override var type: String) : ClassRoom {
    inner class Box(var item: String) {
        fun funny() {
            println("Fuck Me!!")
        }
    }
}