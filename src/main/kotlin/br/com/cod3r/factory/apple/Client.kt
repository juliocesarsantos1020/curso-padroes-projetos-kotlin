package br.com.cod3r.factory.apple

import br.com.cod3r.factory.apple.factory.gof.IPhone11ProFactory
import br.com.cod3r.factory.apple.factory.gof.IPhoneFactory
import br.com.cod3r.factory.apple.factory.gof.IPhoneXFactory
import br.com.cod3r.factory.apple.model.IPhone

fun main() {
    val iphoneXFactory: IPhoneFactory = IPhoneXFactory()
    val iphone11ProFactory: IPhoneFactory = IPhone11ProFactory()

    println("### Ordering an iPhone X")
    val iPhone: IPhone = iphoneXFactory.orderIPhone()
    print(iPhone)

    println("\n\n### Ordering an iPhone 11 HighEnd")
    val iPhone2 = iphone11ProFactory.orderIPhone()
    print(iPhone2)
}
