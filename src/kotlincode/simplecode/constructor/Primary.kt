package kotlincode.simplecode.constructor

// Primary constructor with assess modify
class Primary public constructor(name: String? = null, age: Int? = null) {
    var name: String? = name
    var age: Int? = age

    fun showMySelf() {
        println("Primary: $name : $age")
    }
}

// Primary constructor
class Primary2(name: String? = null, age: Int? = null) {
    var name: String? = name
    var age: Int? = age

    fun showMySelf() {
        println("Primary: $name : $age")
    }
}

// Primary constructor with body
class Primary3(name: String? = null, age: Int? = null) {
    var name: String? = name
    var age: Int? = age

    init {
        println("PrimaryInit: $name : $age")
    }
}