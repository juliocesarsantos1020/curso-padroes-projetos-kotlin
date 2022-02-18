package br.com.cod3r.abstractfactory.apple.model.iphone

import br.com.cod3r.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory

class IPhoneX(rules: CountryRulesAbstractFactory) : IPhone(rules = rules) {
    override fun getHardware() {
        println("Hardware list")
        println("\t- 5.8in Screen")
        println("\t- A11 Chipset")
        println("\t- 3Gb RAM")
        println("\t- 256Gb Memory")
    }
}
