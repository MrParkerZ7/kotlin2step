package kotlincode.kotlin_document.d_function_lambdas

fun main(args: Array<String>) {

    takePhotos(1.6f, 51, { sensor: Float, pixcel: Int -> println("Quality: " + sensor * pixcel) })
    timeLine(50, object : TakeTime {
        override fun bonusTime(remain: Int): Double = remain * 1.3
    })
}

fun takePhotos(sensor: Float, pixcel: Int, take: (Float, Int) -> Unit) = take(sensor, pixcel)

fun timeLine(remain: Int, takeTime: TakeTime) {
    val moreTime = takeTime.bonusTime(remain)
    println("BonusTime: " + moreTime)
}

interface TakeTime {
    fun bonusTime(remain: Int): Double
}
