package kotlincode.SimpleCode.Constructor

class RunSecondary {
    var name: String? = null
    var age: Int? = null

    // This's secondary Constructor which can have body like Constructor in java
    constructor(name: String? = null, age: Int? = null) {
        this.name = name
        this.age = age
        println("RunSecondary: $name : $age")
    }
}