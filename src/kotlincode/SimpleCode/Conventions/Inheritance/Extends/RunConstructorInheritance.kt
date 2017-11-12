package kotlincode.SimpleCode.Conventions.Inheritance.Extends

fun main(args: Array<String>) {

    var park: Phone = Iphone("Park")

}

private open class Phone(owner: String? = null) {
    init {
        println("Phone: os : $owner")
    }
}

private class Iphone(owner: String? = null) : Phone(owner) {
    init {
        println("Iphone: ios : $owner")
    }
}

