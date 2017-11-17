package kotlincode.kotlin_document.c_class_object

fun main(args: Array<String>) {
    var phone = Samsung()
    phone.showState()
}

private interface Phone {
    var color: String
    var size: Any

    fun call()
}

private class Samsung(
        override var color: String = "Black",
        override var size: Any = object {
            var wide: Int = 4
            var hight: Int = 5
        }) : Phone {

    override fun call() {
        println("Samsung: Calling")
    }

    fun showState() {
        println("$color : $size")
    }
}
