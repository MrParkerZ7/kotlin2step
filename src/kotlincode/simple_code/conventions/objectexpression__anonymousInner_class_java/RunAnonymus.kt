package kotlincode.simple_code.conventions.objectexpression__anonymousInner_class_java

fun main(args: Array<String>) {

    // Using "object" keyword to create anonymous inner class
    var programmer: Subject = object : Subject {
        override fun work() {
            println("Codding Job")
        }
    }

    programmer.work()
}

private interface Subject {
    fun work()
}

