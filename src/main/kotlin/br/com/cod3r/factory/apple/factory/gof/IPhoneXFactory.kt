package br.com.cod3r.factory.apple.factory.gof

import br.com.cod3r.factory.apple.model.IPhone
import br.com.cod3r.factory.apple.model.IPhoneX

class IPhoneXFactory : IPhoneFactory() {
    override fun createIPhone(): IPhone {
        return IPhoneX()
    }
}
