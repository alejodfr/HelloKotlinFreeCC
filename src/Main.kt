
//mas ejemplos de control de variables
val name = "Nate"
var greeting: String? = null

fun main(){
    // si cambiamos el greeting = "hello" imprimira hello porque se cumpliria la condicion de abajo
    val greetingToPrint = if(greeting != null) greeting else "hi"
    println(greetingToPrint)
    println(name)
    println(greeting)

}