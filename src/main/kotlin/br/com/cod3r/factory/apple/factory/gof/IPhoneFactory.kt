package br.com.cod3r.factory.apple.factory.gof

import br.com.cod3r.factory.apple.model.IPhone

abstract class IPhoneFactory {

    fun orderIPhone(): IPhone {
        val device: IPhone = createIPhone()

        device.getHardware()
        device.assemble()
        device.certificates()
        device.pack()

        return device
    }

    protected abstract fun createIPhone(): IPhone
}
