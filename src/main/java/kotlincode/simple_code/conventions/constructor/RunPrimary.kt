package kotlincode.simple_code.Conventions.Constructor

// Primary Constructor with assess modify
class Primary public constructor(name: String? = null, age: Int? = null) {
    var name: String? = name
    var age: Int? = age

    fun showMySelf() {
        println("Primary: $name : $age")
    }
}

// Primary Constructor
class Primary2(name: String? = null, age: Int? = null) {
    var name: String? = name
    var age: Int? = age

    fun showMySelf() {
        println("Primary: $name : $age")
    }
}

// Primary Constructor with body.
class Primary3(name: String? = null, age: Int? = null) {
    var name: String? = name
    var age: Int? = age

    // Init which is the body or primary Constructor.
    init {
        println("PrimaryInit: $name : $age")
    }
}