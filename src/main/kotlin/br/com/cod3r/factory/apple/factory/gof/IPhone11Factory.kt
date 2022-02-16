package br.com.cod3r.factory.apple.factory.gof

import br.com.cod3r.factory.apple.model.IPhone
import br.com.cod3r.factory.apple.model.IPhone11

class IPhone11Factory : IPhoneFactory() {
    override fun createIPhone(): IPhone {
        return IPhone11()
    }
}
