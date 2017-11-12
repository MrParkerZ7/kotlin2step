package kotlincode.simple_code.Conventions.Constructor

//
class RunPrimaryAndSecondary(name: String? = null, age: Int? = null) {
    var name = name
    var age = age
    var skill: String? = null
    var guild: String? = null

    // When we create secondary Constructor we also need to call primary Constructor. It's require in kotlin.
    constructor(name: String? = null, age: Int? = null, skill: String? = null, guild: String? = null) : this(name, age) {
        this.skill = skill
        this.guild = guild
        println("PrimarySecondary: $name : $age : $skill : $guild")
    }

}