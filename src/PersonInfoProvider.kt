interface PersonInfoProvider {
    val providerInfo : String
    fun printInfo(person: Person){
        println(providerInfo)
        person.printInfo()
    }
}



class BasicInfoProvider : PersonInfoProvider{
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("addtional print statement")
    }
}


fun main(){
    val provider = BasicInfoProvider()
    provider.printInfo(Person())
}

//mejor ponesmole pausas para este video 1h 30 minutos