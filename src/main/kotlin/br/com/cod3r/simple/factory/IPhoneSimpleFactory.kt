package br.com.cod3r.simple.factory

import br.com.cod3r.simple.model.IPhone
import br.com.cod3r.simple.model.IPhone11
import br.com.cod3r.simple.model.IPhone11Pro
import br.com.cod3r.simple.model.IPhoneX
import br.com.cod3r.simple.model.IPhoneXSMax

class IPhoneSimpleFactory {

    companion object {
        fun orderIPhone(generation: String, level: String): IPhone {
            val device = when (generation) {
                "X" -> {
                    when (level) {
                        "standard" -> IPhoneX()
                        "highEnd" -> IPhoneXSMax()
                        else -> throw Exception()
                    }
                }
                "11" -> {
                    when (level) {
                        "standard" -> IPhone11()
                        "highEnd" -> IPhone11Pro()
                        else -> throw Exception()
                    }
                }
                else -> throw Exception()
            }

            return device.also {
                it.getHardware()
                it.assemble()
                it.certificates()
                it.pack()
            }
        }
    }
}
