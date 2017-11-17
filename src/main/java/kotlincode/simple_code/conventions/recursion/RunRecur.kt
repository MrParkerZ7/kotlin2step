package kotlincode.simple_code.Conventions.Recursion

import java.math.BigInteger

fun main(args: Array<String>) {
    var ammo = reload(30, 2)
    println("FULL AMMO! $ammo/$ammo")

    var result = fibonacciNumber(10000)
    println("Fibonacci: ${result.toString().length} : $result")
}

private fun reload(magazine: Int, remain: Int): Int {
    if (remain != magazine) {
        println("Increase $remain/$magazine")
        return reload(magazine, remain + 1)
    } else {
        return magazine
    }
}

// tailrec keyword using for fix StackOverflowError
private tailrec fun fibonacciNumber(num: Int, result: BigInteger = BigInteger("1")): BigInteger {
    if (num == 0)
        return result
    else
        return fibonacciNumber(num - 1, BigInteger("$num") * result)
}