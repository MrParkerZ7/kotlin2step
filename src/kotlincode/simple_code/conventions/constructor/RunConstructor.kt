package kotlincode.simple_code.Conventions.Constructor

fun main(args: Array<String>) {
    primaryConstructor()
    secondaryContractor()
    primaryAndSecondaryConstructor()
}

private fun primaryConstructor() {
    var p = Primary(name = "Park", age = 52)
    p.showMySelf()

    var p2 = Primary2(name = "Macro", age = 76)
    p2.showMySelf()

    var p3 = Primary3(name = "Anna", age = 24)
}

private fun secondaryContractor() {
    var s = RunSecondary(name = "Maria", age = 23)
}

private fun primaryAndSecondaryConstructor() {
    var ps = RunPrimaryAndSecondary(name = "John", age = 27, skill = "NodeJS", guild = "Google")
}

