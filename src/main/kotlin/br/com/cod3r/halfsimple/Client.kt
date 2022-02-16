package br.com.cod3r.halfsimple

import br.com.cod3r.halfsimple.factory.IPhone11Factory
import br.com.cod3r.halfsimple.factory.IPhoneFactory
import br.com.cod3r.halfsimple.factory.IPhoneXFactory

fun main() {
    val genXFactory: IPhoneFactory = IPhoneXFactory()
    val gen11Factory: IPhoneFactory = IPhone11Factory()

    println("### Ordering an iPhone X")
    val iPhone = genXFactory.orderIPhone(level = "standard")
    print(iPhone)

    println("\n\n### Ordering an iPhone 11 HighEnd")
    val iPhone2 = gen11Factory.orderIPhone(level = "highEnd")
    print(iPhone2)
}
