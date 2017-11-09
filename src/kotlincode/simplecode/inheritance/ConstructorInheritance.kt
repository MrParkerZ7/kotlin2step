package kotlincode.simplecode.inheritance

fun main(args: Array<String>) {

    var park: Phone = Iphone("Park")

}

open class Phone(owner: String? = null) {
    init {
        println("Phone: os : $owner")
    }
}

class Iphone(owner: String? = null) : Phone(owner) {
    init {
        println("Iphone: ios : $owner")
    }
}

