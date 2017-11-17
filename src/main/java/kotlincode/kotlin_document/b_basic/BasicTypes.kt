package kotlincode.kotlin_document.b_basic

/**
 * :: Primitive Data Type ::
 * Byte : 8
 * Short : 16
 * Int : 32
 * Long : 64
 * Float : 32
 * Double : 64
 */

fun main(args: Array<String>) {
    val price = """${'$'}9.99"""
    println(price)

    val text = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
    println(text)
}