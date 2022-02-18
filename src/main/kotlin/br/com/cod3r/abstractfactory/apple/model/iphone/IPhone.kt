package br.com.cod3r.abstractfactory.apple.model.iphone

import br.com.cod3r.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory

abstract class IPhone(private val rules: CountryRulesAbstractFactory) {
    abstract fun getHardware()

    fun assemble() {
        println("Assembling all the hardwares")
    }

    fun certificates() {
        println("Testing all the certificates")
        println(rules.getCertificates().applyCertification())
    }

    fun pack() {
        println("Packing the device")
        println(rules.getPacking().pack())
    }
}
