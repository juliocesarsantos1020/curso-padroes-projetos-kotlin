package br.com.cod3r.simple.model

class IPhone11 : IPhone() {
    override fun getHardware() {
        println("Hardware list")
        println("\t- 6.1in Screen")
        println("\t- A13 Chipset")
        println("\t- 4Gb RAM")
        println("\t- 256Gb Memory")
    }
}
