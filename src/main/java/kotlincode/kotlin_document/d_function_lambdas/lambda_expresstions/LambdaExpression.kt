package kotlincode.kotlin_document.d_function_lambdas.lambda_expresstions

fun main(args: Array<String>) {

    var itemINeed = object {
        var phone = 18_000
        var game = 5_000
        var bbGun = 6_000
        var lens = 12_000
        var totally = phone + game + bbGun + lens
    }
    var result = useMoney(50_000, 25_000, { money, bonus -> (money + bonus) - itemINeed.totally })
    println("Remain: $result")
}

fun useMoney(money: Int, bonus: Int, use: (Int, Int) -> Int): Int = use(money, bonus)
