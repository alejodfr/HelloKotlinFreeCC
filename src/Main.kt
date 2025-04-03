
//collecciones e iteracciones

fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")


fun main(){
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    println(interestingThings.size)
    println(interestingThings[0]) //imprime el primer elemento del array porque los arreglos comienzas desde el zero
    println(interestingThings.get(0)) //hace lo mismo que la linea superior

   interestingThings.forEach {
        println(it) //it is the default name for each element in the array
   }
}

