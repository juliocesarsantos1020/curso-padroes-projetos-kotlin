package br.com.cod3r.abstractfactory.apple.factory.apple

import br.com.cod3r.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhoneX
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhoneXSMax

class IPhoneXFactory(private val rules: CountryRulesAbstractFactory) : IPhoneFactory(rules = rules) {
    override fun createIPhone(level: String): IPhone {
        return when (level) {
            "standard" -> IPhoneX(rules = rules)
            "highEnd" -> IPhoneXSMax(rules = rules)
            else -> throw Exception()
        }
    }
}
