package br.com.cod3r.simple.model

abstract class IPhone {

    abstract fun getHardware()

    fun assemble() = println(message = "Assembling all the hardwares")
    fun certificates() = println(message = "Testing all the certificates")
    fun pack() = println(message = "Packing the device")
}
