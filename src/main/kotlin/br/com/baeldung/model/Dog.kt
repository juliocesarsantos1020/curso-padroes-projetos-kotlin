package br.com.baeldung.model

class Dog : Animal {
    override fun getAnimal(): String {
        return "Dog"
    }

    override fun makeSound(): String {
        return "Bark"
    }
}
