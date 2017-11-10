package kotlincode.simplecode.companion

fun main(args: Array<String>) {
    Human.imagine()
}

class Human {

    // Companion object just like static in java
    companion object {

        @JvmStatic // this annotation require for let java can be call static from kotlin, other wish can't be call.
        fun imagine() {
            println("Human: PornHub")
        }
    }
}