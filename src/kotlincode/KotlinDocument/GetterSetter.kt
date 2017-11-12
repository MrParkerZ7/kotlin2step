package kotlincode.KotlinDocument

fun main(args: Array<String>) {

    var c = Camera()

    c.shutter = "Phone"
    c.shutter = "Dog"
    c.shutter = "Computer"
    c.shutter = "Human"

    println(c.shutter)
}

data class Camera(var name: String = "Cannon") {
    var count: Int = 0 // using to count shutter time.
        private set // private with set using for close setter ability of value1 from outside object.

    var shutter: String? = null
        get() = this.toString()  // Getter: return to string.
        set(value) { // Setter: get value from outside through parameter to inside which is method.
            field = value // field referent to this variable.
            count++ // set count++
        }

    var setIso: Int = 50
        set(value) {
            if (value >= 50)
                field = value
        }
}