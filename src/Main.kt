
// explicacion de funciones basicas
// llamado de funciones

fun sayHello(itemToGreet:String) {
    val msg = "Hello $itemToGreet"
    println(msg)
}


fun main(){
    sayHello(itemToGreet = "Kotlin")
    sayHello(itemToGreet = "World")
}

