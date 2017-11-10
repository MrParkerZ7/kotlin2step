package kotlincode.simplecode.anonymousinnerclass

fun main(args: Array<String>) {

    // Using "object" keyword to create anonymous inner class
    var programmer: Subject = object : Subject {
        override fun work() {
            println("Codding Job")
        }
    }

    programmer.work()
}

interface Subject {
    fun work()
}

