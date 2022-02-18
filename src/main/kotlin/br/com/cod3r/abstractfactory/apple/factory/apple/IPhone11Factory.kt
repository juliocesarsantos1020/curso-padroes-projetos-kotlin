package br.com.cod3r.abstractfactory.apple.factory.apple

import br.com.cod3r.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone11
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone11Pro

class IPhone11Factory(private val rules: CountryRulesAbstractFactory) : IPhoneFactory(rules = rules) {
    override fun createIPhone(level: String): IPhone {
        return when (level) {
            "standard" -> IPhone11(rules = rules)
            "highEnd" -> IPhone11Pro(rules = rules)
            else -> throw Exception()
        }
    }
}
