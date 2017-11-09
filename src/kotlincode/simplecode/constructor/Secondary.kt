package kotlincode.simplecode.constructor

class Secondary {
    var name: String? = null
    var age: Int? = null

    // This's secondary constructor which can have body like constructor in java
    constructor(name: String? = null, age: Int? = null) {
        this.name = name
        this.age = age
        println("Secondary: $name : $age")
    }
}