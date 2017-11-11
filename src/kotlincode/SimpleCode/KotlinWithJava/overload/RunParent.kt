package kotlincode.SimpleCode.KotlinWithJava.overload

fun main(args: Array<String>) {
    var getIt = getReward(10000)
    println("$getIt")

    var getItAgain = getReward(10000, 1.2F)
    println(getItAgain)

    var getThrid = getReward(bonus = 1.5f, require = 20000)
    println(getThrid)
}

// Default parameter. When we define default value of parameter it's will not take
fun getReward(require: Int, bonus: Float = 1f): Int = (require * bonus).toInt()

@JvmOverloads // Using for let kotlin generate method override automatic for calling from java only
fun getMoney(require: Int, bonus: Float = 1f): Int = (require * bonus).toInt()