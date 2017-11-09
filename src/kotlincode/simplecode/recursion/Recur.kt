package kotlincode.simplecode.recursion

fun main(args: Array<String>) {
    var ammo = reload(30, 2)
    println("FULL AMMO! $ammo/$ammo")
}

fun reload(magazine: Int, remain: Int): Int {
    if (remain != magazine) {
        println("Increase $remain/$magazine")
        return reload(magazine, remain + 1)
    } else {
        return magazine
    }
}