package br.com.cod3r.halfsimple.factory

import br.com.cod3r.factory.apple.model.IPhone

abstract class IPhoneFactory {
    fun orderIPhone(level: String): IPhone {
        val device: IPhone = createIPhone(level)

        device.getHardware()
        device.assemble()
        device.certificates()
        device.pack()

        return device
    }

    protected abstract fun createIPhone(level: String): IPhone
}
