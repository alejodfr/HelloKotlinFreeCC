
//mas ejemplos de control de variables 2
val name = "Nate"
var greeting: String? = null

fun main(){
    val greetingToPrint = when (greeting) {
        null -> "hi"
        else -> greeting
    }
    println(greetingToPrint)
    println(name)
    println(greeting)
}