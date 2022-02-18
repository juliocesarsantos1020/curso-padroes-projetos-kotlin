package br.com.baeldung.factory

interface AbstractFactory<T> {
    fun create(animalType: String): T
}
