package kotlincode.kotlin_document.c_class_object

interface CarFactory {
    fun motor()
    fun wheel()
    fun structure()
}

class BMW : CarFactory {
    override fun motor() {
        println("BMW: motor-3000 cc")
    }

    override fun wheel() {
        println("BMW: wheel-carbon")
    }

    override fun structure() {
        println("BMW: model-i8")
    }
}

class BmwShop(bmw: BMW) : CarFactory by bmw

fun main(args: Array<String>) {
    var i8 = BMW()
    BmwShop(i8).motor()
    BmwShop(i8).wheel()
    BmwShop(i8).structure()

}