package br.com.cod3r.factory.apple.model

class IPhoneX : IPhone() {
    override fun getHardware() {
        println("Hardware list")
        println("\t- 5.8in Screen")
        println("\t- A11 Chipset")
        println("\t- 3Gb RAM")
        println("\t- 256Gb Memory")
    }
}
