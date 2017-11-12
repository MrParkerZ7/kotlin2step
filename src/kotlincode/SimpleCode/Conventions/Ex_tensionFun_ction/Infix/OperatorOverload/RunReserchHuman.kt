package kotlincode.SimpleCode.extensionfunction.infix.operatoroverload

fun main(args: Array<String>) {
    var mia = Human(age = 27, skill = "jump")
    var park = Human(skill = "Talk", age = 23)
    var macro = Human(age = 55, skill = "Run")
    var may = Human(skill = "Walk", age = 17)

    var hunt: Human = park.plus(mia)
    var nano: Human = hunt plus macro // "plus" here is a infix Function
    var siara: Human = may + nano // "+" here is a operator overloading

    println(hunt)
    println(nano)
    println(siara)
}

/**
 * Extension Function : This Function is belong to Human class. Just live outside it own class. We can call it everywhere in scope of modifier.
 * Infix Function: which a Function but write same as word with space no blacked block accept only one parameter and can be use with extension Function only
 * Operator overloading: which just like infix Function but replace name Function with operator
 */

private operator infix fun Human.plus(human: Human): Human {
    var newHuman = Human()
    newHuman.skill = this.skill + " & " + human.skill
    newHuman.age = this.age!! + human.age!!
    return newHuman
}

private data class Human(var skill: String? = null, var age: Int? = null)