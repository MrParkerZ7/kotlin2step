package kotlincode.simplecode.comparision

fun main(args: Array<String>) {
    var str1 = "Park"
    var str2 = "park"

    // Normal string compare
    if (str1 == str2)
        println("CompareOne: Equal")
    else
        println("CompareOne: Unequal")

    // IgnoreCase is mean you don't care about it's capital or lowercase
    if (str1.equals(str2, true))
        println("CompareTwo: Equal")
    else
        println("CompareTwo: Unequal")
}