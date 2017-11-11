package kotlincode.SimpleCode.Com_panion.Static_Java

fun main(args: Array<String>) {
    kotlincode.SimpleCode.Com_panion.Static_Java.Human.Companion.imagine()
}

private class Human {
    // Companion object just like staticinjava in java
    companion object {

        @JvmStatic // this annotation require for let java can be call staticinjava from kotlin, other wish can't be call.
        fun imagine() {
            println("Human: PornHub")
        }
    }
}