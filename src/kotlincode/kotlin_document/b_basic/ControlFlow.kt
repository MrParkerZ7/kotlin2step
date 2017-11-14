package kotlincode.kotlin_document.b_basic

fun main(args: Array<String>) {
//    whenLogic()
//    whenIn()
//    whileLoop()
//    doWhile()
//    loopContinue()
//    loopBreak()
//    loopLabels()
    loopJump()

}

fun loopJump() {
    var ints = listOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)

    fun manner1() {
        ints.forEach lit@ {
            if (it == 5) return@lit // return that meaning skip one step
            print(it)
        }
        println()
    }

    fun manner2() {
        ints.forEach {
            if (it == 5) return@forEach // return that meaning skip one step
            print(it)
        }
        println()
    }

    fun manner3() {
        ints.forEach(fun(value: Int) {
            if (value == 5) return
            print(value)
        })
        println()
    }

    // all ways same output. no 5.
    manner1()
    manner2()
    manner3()
}

fun loopLabels() {
    var x = 54
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (i == j && j == x) {
                println("$i : $j")
                break@loop  // break meaning stop
            }
        }
    }
}

fun loopBreak() {
    var list = listOf("Park", "Thor", "Suck", "Lion", "Mala", "Pure")

    var count = 0
    for (name in list) {
        if ("Lion".equals(name, true))
            break
        count++
    }
    println("Found: in slot $count")
}

fun loopContinue() {
    var list = listOf<Int>(1, 3, 5, 4, 6, 8, 7, 9, 5, 1, 1, 22, 55, 33, 66, 45, 32, 12, 14, 2, 6, 54, 21, 54, 88, 99, 100, 102)
    var find = listOf(54, 13, 19, 1, 9, 100, 102, 0, 98, 78)

    var count = 0
    for (f in find) {
        if (f in list)
            println("$f: was in list")
        else {
            println("$f: wasn't in list")
            continue
        }
        count++
    }
    println("Found: $count")
}

fun doWhile() {
    var x = 10

    do {
        println(x--)
    } while (x > 0)
}

fun whileLoop() {
    var x = 10
    while (x > 0)
        println("While: ${x--}")
}

private fun whenLogic() {
    var x = 1
    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }
}

private fun whenIn() {
    var customer = listOf<String>("Park", "Thor", "Hulk", "Odin")
    var owner = listOf<String>("Marry", "Mass", "Ray")

    var who = "ray"
    when (who) {
        in customer -> println("There is customer.")
        in owner -> println("There is owner")
        else -> println("There is THIEF!!")
    }
}