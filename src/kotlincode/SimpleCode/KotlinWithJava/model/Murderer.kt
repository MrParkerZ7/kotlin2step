package kotlincode.SimpleCode.KotlinWithJava.model

class Murderer {
    var name: String = ""
    var subject: String = ""

    constructor()

    constructor(name: String, subject: String) {
        this.name = name
        this.subject = subject
    }

    override fun toString(): String {
        return "Murderer(name='$name', subject='$subject')"
    }


}