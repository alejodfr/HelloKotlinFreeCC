
//Just explaining how type inference and null variables works in kotlin
val name = "Nate"
var greeting: String? = null

fun main(){
    println(greeting)
    println(name)

    greeting = null
    greeting = "hi"
    println(greeting)
}