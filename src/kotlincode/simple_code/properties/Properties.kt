package kotlincode.simple_code.Properties

fun main(args: Array<String>) {

    var prop = PropertiesExample()
    prop.gear = 1
    prop.gear = 2
    prop.gear = 3
    prop.gear = 2
    prop.gear = null

    println("Total Chain Time: ${prop.contChain}")
}

private class PropertiesExample {
    var contChain = 0
    var gear: Int? = null
        set(v: Int?) {
            field = v
            contChain++
        }

}