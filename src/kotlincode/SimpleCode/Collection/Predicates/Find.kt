package kotlincode.SimpleCode.Collection.Predicates

fun main(args: Array<String>) {

    // Returns the first value. which pass validate.
    var member: MutableList<String> = mutableListOf("Park", "Macro", "Thor")
    var validate = member.find { it == "Thor" } // return single value

    println(validate)
}