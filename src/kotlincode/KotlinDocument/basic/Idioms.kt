package kotlincode.KotlinDocument.basic

import java.io.File
import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {
//    useMap()
//    ifMapNull()
//    ifByIn()
//    ifNull()
//    ifNotNull()
//    statementIfNull()
//    singleton()
//    tryCatch()
//    funExpression()
//    funExpressionSingleLine()
//    multipleCallingMethodsOnObject()
    javaStream()
    
}

fun javaStream() {
    val stream = Files.newInputStream(Paths.get("21day.txt"))
    stream.buffered().reader().use { reader ->
        println(reader.readText())
    }
}

fun multipleCallingMethodsOnObject() {
    class Turtle {
        fun penDown() = println("Down!")
        fun penUp() = println("Up!")
        fun turn(degrees: Double) = println("Degrees: $degrees")
        fun forward(pixels: Double) = println("Pixels: $pixels")
    }

    val myTurtle = Turtle()
    with(myTurtle) {
        //draw a 100 pix square
        penDown()
        for (i in 1..2) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }
}

fun funExpressionSingleLine() {

    fun validatedScore(int: Int) = if (int >= 50) "Pass" else "Failed"
    println("ExamResult: ${validatedScore(51)}")
}

fun funExpression() {

    fun validate(num: Int): String? = when (num) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        else -> throw IllegalArgumentException("FUCK YOU!")
    }

    println("Result: ${validate(3)}")
}

fun tryCatch() {

    val n: Int? = null
    val result = try {
        5 * n!!
    } catch (e: NullPointerException) {
        println("Error: $e")
    } finally {
        println("Bye!")
    }
}

private fun ifMapNull() {
    val value = mapOf<Int, String?>(1 to "Park", 2 to null)

    fun transformValue(it: Map<Int, String?>): String? {
        for ((k, v) in it) {
            if (v != null)
                println("$k : $v")
            else
                return v
        }
        return null
    }

    val mapped = value?.let { transformValue(it) } ?: println("Value: is null")
}


private fun useMap() {
    val map = mapOf<Int, String>(1 to "Park", 2 to "Mark", 3 to "Munear")
    for ((k, v) in map) println("Key: $k Value: $v")
    for (n in map) println(n)
    println("Key: 2 = ${map[2]}")
}

private fun ifByIn() {
    var name = listOf<String>("Park", "Mark", "Thor")
    if ("Park" in name)
        println("He is the one of them!!")
    else
        println("He is not the one of them..")
}

private fun ifNull() {
    val files = File("Test").listFiles()

    println(files?.size ?: "The data is null")
}

private fun ifNotNull() {
    val value = "Money"

    value?.let {
        println("$value: not null!") // execute this block if not null
    }
}

private fun statementIfNull() {
    val values = mapOf<String, String?>("email" to null, "name" to "Park")
    val email = values["email"] ?: throw IllegalStateException("Email is missing!")
}

private fun singleton() {
    var obj = object : Demo {
        override fun talk() {
            println("Talk: fuck you!")
        }
    }
}

private interface Demo {
    fun talk()
}