package kotlincode.simplecode.extenfun.infix.operatoroverload

class Human {
    var skill: String? = null
    var age: Int? = null

    constructor(skill: String? = null, age: Int? = null) {
        this.skill = skill
        this.age = age
    }

    override fun toString(): String {
        return "Human(skill=$skill, age=$age)"
    }


}