package kotlincode.simple_code.Conventions.objectexpression.AnonymousInnerClass_java

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

