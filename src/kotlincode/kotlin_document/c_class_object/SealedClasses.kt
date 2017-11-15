package kotlincode.kotlin_document.c_class_object

fun main(args: Array<String>) {
    var park = Human.Subject(subject = "Coding", salary = 0, name = "Park", age = 23)

    println(park.getShowDetail())
}

private sealed class Human(var aName: String, var aAge: Int) {
    fun getShowDetail() {
        println("$aName : $aAge")
    }

    data class Subject(var name: String, var age: Int, var subject: String? = null, var salary: Int? = null) : Human(name, age) {
        fun showSubject() {
            println("$subject : $salary")
        }
    }

    data class Car(var name: String, var age: Int, var bran: String? = null, var model: String? = null) : Human(name, age) {
        fun showCar() {
            println("$bran : $model")
        }
    }

}

