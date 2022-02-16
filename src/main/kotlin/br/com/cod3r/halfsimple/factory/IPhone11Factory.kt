package br.com.cod3r.halfsimple.factory

import br.com.cod3r.factory.apple.model.IPhone
import br.com.cod3r.factory.apple.model.IPhone11
import br.com.cod3r.factory.apple.model.IPhone11Pro

class IPhone11Factory : IPhoneFactory() {
    override fun createIPhone(level: String): IPhone {
        return when (level) {
            "standard" -> IPhone11()
            "highEnd" -> IPhone11Pro()
            else -> throw RuntimeException("Não existe!")
        }
    }
}
