package br.com.cod3r.factory.apple.factory.gof

import br.com.cod3r.factory.apple.model.IPhone
import br.com.cod3r.factory.apple.model.IPhoneXSMax

class IPhoneXSMaxFactory : IPhoneFactory() {
    override fun createIPhone(): IPhone {
        return IPhoneXSMax()
    }
}
