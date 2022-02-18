package br.com.cod3r.abstractfactory.apple.model.iphone

import br.com.cod3r.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory

class IPhone11Pro(rules: CountryRulesAbstractFactory) : IPhone(rules = rules) {
    override fun getHardware() {
        println("Hardware list")
        println("\t- 6.5in Screen")
        println("\t- A13 Chipset")
        println("\t- 4Gb RAM")
        println("\t- 512Gb Memory")
    }
}
