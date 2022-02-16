package br.com.cod3r.halfsimple.model

class IPhone11Pro : IPhone() {
    override fun getHardware() {
        println("Hardware list")
        println("\t- 6.5in Screen")
        println("\t- A13 Chipset")
        println("\t- 4Gb RAM")
        println("\t- 512Gb Memory")
    }
}
