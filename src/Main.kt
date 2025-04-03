
//mas ejemplos de control de variables 2.1
val name = "Nate"
var greeting: String? = null

fun main(){
    greeting = "hello"
    val greetingToPrint = when (greeting) {
        null -> "hi"
        else -> greeting
    }
    println(greetingToPrint)
    println(name)
    println(greeting)
}