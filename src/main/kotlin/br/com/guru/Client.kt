package br.com.guru

import br.com.guru.factory.abstractfactory.cadeira.CadeiraAbstractFactory
import br.com.guru.factory.abstractfactory.cadeira.CadeiraModernoFactory

fun main() {
    val factory: CadeiraAbstractFactory = CadeiraModernoFactory()
    println(factory.criarCadeira().sentar())
}
