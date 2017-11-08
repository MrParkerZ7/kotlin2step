package kotlincode.simplecode.loop

fun main(args: Array<String>) {

    var value = 1..6 // assign value from 1 to 6
    var untilValue = 2 until 7 // just like up line but using method
    var reverseValue = 9 downTo 1 // assign value from 9 to 1


    // common loop
    for (v in value)
        println("Common: $v")

    // reversed value
    for (v in value.reversed())
        println("Revers: $v")

    // step loop:  it'll skip 1 variable to loop
    for (v in value step 2)
        println("Step: $v")

    // assign by count in ascii code number.
    var str = 'A'..'a'
    for (s in str)
        println(s)

}