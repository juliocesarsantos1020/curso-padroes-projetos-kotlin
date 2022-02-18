package br.com.baeldung.factory

import br.com.baeldung.model.Animal
import br.com.baeldung.model.Dog
import br.com.baeldung.model.Duck

class AnimalFactory : AbstractFactory<Animal> {
    override fun create(animalType: String): Animal {
        return when (animalType) {
            "Dog" -> Dog()
            "Duck" -> Duck()
            else -> throw RuntimeException()
        }
    }
}
