
//collecciones e iteracciones

fun sayHello(greeting: String, vararg itemToGreet:String) {
    itemToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String = "hello", name: String = "kotlin") = println("$greeting $name")

fun main(){
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    sayHello(itemToGreet = *interestingThings, greeting = "hi")
}

