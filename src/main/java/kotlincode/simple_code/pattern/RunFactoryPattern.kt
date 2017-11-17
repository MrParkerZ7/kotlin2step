package kotlincode.simple_code.Pattern

fun main(args: Array<String>) {
    var park: Human = Subject.getSubject("Kill")
    park.breathe()
    park.activity()
}

private class Subject {
    companion object {
        fun getSubject(prefer: String): Human {
            if (prefer == "IT")
                return Programmer()
            else if (prefer == "Play")
                return Gammer()
            else if (prefer == "Heal")
                return Medic()
            else if (prefer == "Kill")
                return Killer()
            else
                return object : Human {
                    override fun activity() {
                        println("Human: fabbb")
                    }
                }
        }
    }
}

private interface Human {
    fun breathe() {
        println("Human: breathe")
    }

    fun activity()
}

private class Programmer : Human {
    override fun activity() {
        println("Programmer: coding")
    }

}

private class Gammer : Human {
    override fun activity() {
        println("Gammer: Playing")
    }

}

private class Medic : Human {
    override fun activity() {
        println("Medic: healing")
    }

}

private class Killer : Human {
    override fun activity() {
        println("Killer: killing")
    }

}