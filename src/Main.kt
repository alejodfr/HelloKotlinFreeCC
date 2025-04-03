
//un ejempko del use del when
val name = "Nate"
var greeting: String? = null

fun main(){
    greeting = "hello"
    when (greeting) {
        null -> println("hi")
        else -> println(greeting)
    }


    println(name)
    println(greeting)
}