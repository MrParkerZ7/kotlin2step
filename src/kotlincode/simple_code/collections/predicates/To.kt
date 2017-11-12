package kotlincode.simple_code.collections.predicates

/**
 * ".toSet" , ".toMutableSet" ,
 * ".toList" , ".toMutableList" ,
 * ".toCollection" , ".toMutableCollection"
 * Using to convert between collection type.
 */

fun main(args: Array<String>) {

    var client: Collection<Customer> = setOf(Customer("Park", 50), Customer("Logan", 5900), Customer("Thor", 0))
    var store: Set<Shop> = setOf(Shop("Magic Shop", client.toList()))

    println(store)
}

private data class Shop(val name: String, val customers: List<Customer>)
private data class Customer(var name: String, var money: Int)