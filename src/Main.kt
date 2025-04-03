
//collecciones e iteracciones

fun sayHello(greeting: String, vararg itemToGreet:String) {
    itemToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}


fun main(){
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    sayHello("hi", *interestingThings)
}

