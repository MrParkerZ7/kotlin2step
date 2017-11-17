package kotlincode.kotlin_document.c_class_object


fun main(args: Array<String>) {

}

private interface Motor {
    fun dynamo(cc: Int)
}

private interface Body {
    fun structure(fiber: String)
    fun tire(tire: String)
}

private interface Light {
    fun fontLight()
}

private abstract class Motocyle(val cc: Int, var tire: String) : Motor, Body {
    override fun dynamo(cc: Int) {
        println("Motor: $cc CC")
    }

    override fun tire(tire: String) {
        println("Tire: $tire")
    }
}

private open class S1000RR2015(cc: Int, tire: String, var fiber: String) : Motocyle(cc, tire), Light {
    final override fun fontLight() {
        println("Light: Orange")
    }

    override fun structure(fiber: String) {
        println("Structure: $fiber")
    }
}

private class S1000RR2018(cc: Int, tire: String, fiber: String, var wing: String, var turbo: Int) : S1000RR2015(cc = cc, tire = tire, fiber = fiber) {
    override fun structure(fiber: String) {
        println("Structure: $fiber : $wing")
    }

    override fun dynamo(cc: Int) {
        var dynamo2017 = cc * turbo
        super.dynamo(dynamo2017)
    }
}