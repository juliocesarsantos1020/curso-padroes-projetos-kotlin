package br.com.cod3r.abstractfactory.apple

import br.com.cod3r.abstractfactory.apple.factory.abstractfactory.BrazilianRulesAbstractFactory
import br.com.cod3r.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory
import br.com.cod3r.abstractfactory.apple.factory.apple.IPhone11Factory
import br.com.cod3r.abstractfactory.apple.factory.apple.IPhoneFactory
import br.com.cod3r.abstractfactory.apple.factory.apple.IPhoneXFactory

fun main() {
    val rules: CountryRulesAbstractFactory = BrazilianRulesAbstractFactory()
    val genXFactory: IPhoneFactory = IPhoneXFactory(rules = rules)
    val gen11Factory: IPhoneFactory = IPhone11Factory(rules = rules)

    println("### Ordering an iPhone X")
    val iPhone = genXFactory.orderIPhone(level = "standard")
    println(iPhone)

    println("\n\n### Ordering an iPhone 11 HighEnd")
    val iPhone2 = gen11Factory.orderIPhone(level = "highEnd")
    println(iPhone2)
}
