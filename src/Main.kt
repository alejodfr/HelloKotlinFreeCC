
//collecciones e iteracciones

fun sayHello(greeting:String, itemToGreet:List<String>) {
    itemToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}


fun main(){
    val interestingThings = listOf("Kotlin", "Programming", "Comic Books")
    sayHello("hi", interestingThings)
}

