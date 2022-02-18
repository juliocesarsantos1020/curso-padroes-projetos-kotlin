package br.com.cod3r.abstractfactory.apple.model.iphone

import br.com.cod3r.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory

class IPhone11(rules: CountryRulesAbstractFactory) : IPhone(rules) {
    override fun getHardware() {
        println("Hardware list")
        println("\t- 6.1in Screen")
        println("\t- A13 Chipset")
        println("\t- 4Gb RAM")
        println("\t- 256Gb Memory")
    }
}
