package kotlincode.kotlin_document.e_other

private class Store {
    inner class Room {
        fun box() {
            val A = this@Store
            val B = this@Room
            val C = this
        }

        fun String.my() {
            val A = this
            val B = this@my
        }
    }
}

class A { // implicit label @A
    inner class B { // implicit label @B
        fun Int.foo() { // implicit label @foo
            val a = this@A // A's this
            val b = this@B // B's this

            val c = this // foo()'s receiver, an Int
            val c1 = this@foo // foo()'s receiver, an Int

            val funLit = lambda@ fun String.() {
                val d = this // funLit's receiver
            }


            val funLit2 = { s: String ->
                // foo()'s receiver, since enclosing lambda expression
                // doesn't have any receiver
                val d1 = this
            }
        }
    }
}