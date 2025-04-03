
//collecciones e iteracciones

fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")


fun main(){
    val interestingThings = listOf("Kotlin", "Programming", "Comic Books")
    interestingThings.forEach { interestingThings ->
        println(interestingThings)
    }
}

