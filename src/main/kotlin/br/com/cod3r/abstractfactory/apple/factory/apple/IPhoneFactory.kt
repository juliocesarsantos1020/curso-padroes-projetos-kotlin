package br.com.cod3r.abstractfactory.apple.factory.apple

import br.com.cod3r.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone

abstract class IPhoneFactory(rules: CountryRulesAbstractFactory) {

    fun orderIPhone(level: String): IPhone {
        return createIPhone(level = level).apply {
            this.getHardware()
            this.assemble()
            this.certificates()
            this.pack()
        }
    }

    protected abstract fun createIPhone(level: String): IPhone
}
