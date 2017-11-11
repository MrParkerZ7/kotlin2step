package kotlincode.SimpleCode.Logic

fun main(args: Array<String>) {
    var park: Int = 7
    var micro: Int = 5

    // common if else
    if (park == micro)
        println("No winner")
    else if (park > micro)
        println("Park win!!")
    else
        println("live like crap")


    var value: String = "Gold"
    var result: String

    // if else with expression to return something
    result = if (value == "Silver")
        "50 kg"
    else if (value == "Gold")
        "200 kg"
    else
        "Fuck out!!"

    println(result)
}