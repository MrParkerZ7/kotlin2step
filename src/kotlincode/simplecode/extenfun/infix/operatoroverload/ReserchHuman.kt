package kotlincode.simplecode.extenfun.infix.operatoroverload

fun main(args: Array<String>) {
    var mia = Human(age = 27, skill = "jump")
    var park = Human(skill = "Talk", age = 23)
    var macro = Human(age = 55, skill = "Run")
    var may = Human(skill = "Walk", age = 17)

    var hunt: Human = park.plus(mia)
    var nano: Human = hunt plus macro // "plus" here is a infix function
    var siara: Human = may + nano // "+" here is a operator overloading

    println(hunt)
    println(nano)
    println(siara)
}

/**
 * Extension function : This function is belong to Human class. Just live outside it own class. We can call it everywhere in scope of modifier.
 * Infix function: which a function but write same as word with space no blacked block accept only one parameter and can be use with extension function only
 * Operator overloading: which just like infix function but replace name function with operator
 */

private operator infix fun Human.plus(human: Human): Human {
    var newHuman = Human()
    newHuman.skill = this.skill + " & " + human.skill
    newHuman.age = this.age!! + human.age!!
    return newHuman
}