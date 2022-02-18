package br.com.baeldung

import br.com.baeldung.factory.AbstractFactory
import br.com.baeldung.factory.AnimalFactory
import br.com.baeldung.model.Animal

fun main() {
    val factory: AbstractFactory<Animal> = AnimalFactory()
    factory.create("Dog").apply {
        println(message = this.getAnimal())
    }
}
