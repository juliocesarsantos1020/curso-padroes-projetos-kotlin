package br.com.cod3r.halfsimple.factory

import br.com.cod3r.factory.apple.model.IPhone
import br.com.cod3r.factory.apple.model.IPhoneX
import br.com.cod3r.factory.apple.model.IPhoneXSMax

class IPhoneXFactory : IPhoneFactory() {
    override fun createIPhone(level: String): IPhone {
        return when (level) {
            "standard" -> IPhoneX()
            "highEnd" -> IPhoneXSMax()
            else -> throw RuntimeException("Não existe!")
        }
    }
}
