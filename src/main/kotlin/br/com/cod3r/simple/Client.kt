package br.com.cod3r.simple

import br.com.cod3r.simple.factory.IPhoneSimpleFactory

fun main() {
    println("### Ordering an iPhone X")
    val iPhone = IPhoneSimpleFactory.orderIPhone(generation = "X", level = "standard")
    println(iPhone)

    println("\n\n### Ordering an iPhone 11 HighEnd")
    val iPhone2 = IPhoneSimpleFactory.orderIPhone(generation = "11", level = "highEnd")
    println(iPhone2)
}
