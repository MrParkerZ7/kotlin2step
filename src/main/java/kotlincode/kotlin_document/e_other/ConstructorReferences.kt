package kotlincode.kotlin_document.e_other

fun main(args: Array<String>) {
    function { Foo()  }
}

class Foo

fun function(factory: () -> Foo) {
    val x: Foo = factory()
    println(x)
}