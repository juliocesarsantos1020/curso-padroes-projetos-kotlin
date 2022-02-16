package br.com.cod3r.factory.apple.factory.gof

import br.com.cod3r.factory.apple.model.IPhone
import br.com.cod3r.factory.apple.model.IPhone11Pro

class IPhone11ProFactory : IPhoneFactory() {
    override fun createIPhone(): IPhone {
        return IPhone11Pro()
    }
}