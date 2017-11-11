package kotlincode.simplecode.array

/**
 * All array here are fixed value size when declare.
 */
fun main(args: Array<String>) {
//    intArray()
//    intArray2()
    arrayAnyType()

}

private fun arrayAnyType() {
    var str = arrayOfNulls<String>(4)
    str.set(2, "Ai")
    str.set(3, "Mi")
    str[0] = "HDD"
    str[1] = "SSD"

    for (s in str)
        println(" $s ")

}

private fun intArray2() {

    // Declare array and without assign value.
    var str = IntArray(4)
    str[0] = 15
    str[1] = 11
    str.set(2, 7)
    str.set(3, 5)

    for (n in str)
        println(" $n ")
}

private fun intArray() {

    // Declare array and assign value simultaneously.
    var num = intArrayOf(5, 9, 12, 19, 25)
    num[1] = 69

    println("Size: ${num.size}")
    println("LastValue: ${num.last()}")
    println("LastPositionNumber: ${num.lastIndex}")

    for (n in num)
        print(" $n :")
}