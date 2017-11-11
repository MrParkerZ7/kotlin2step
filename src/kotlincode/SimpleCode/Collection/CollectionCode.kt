package kotlincode.SimpleCode.collection

fun main(args: Array<String>) {
    conditionAny()
    conditionFilter()
}

private fun conditionFilter() {
    val number: Collection<Int> = arrayListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

    // .filter using for cut value. which, If the value is false with condition it will delete that value out.
    var cutNumber: Collection<Int> = number.filter { it % 2 == 0 }

    // .filter will return the remain which pass the condition
    cutNumber.forEach(::println)
}

private fun conditionAny() {
    val number: Collection<Int> = arrayListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

    // .filter using for cut value. which, If the value is false with condition it will delete that value out.
    var cutNumber: Collection<Int> = number.filter { it % 2 == 0 }

    // .filter will return the remain which pass the condition
    cutNumber.forEach(::println)

    // .any using for check. If it had any value inside which it true in this condition. Value will be return true.
    var booleanNumber: Boolean = number.any { it % 3 == 0 }

    // .any return only one value which is boolean type.
    println(booleanNumber)
}

