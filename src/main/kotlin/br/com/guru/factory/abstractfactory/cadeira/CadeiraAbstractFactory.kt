package br.com.guru.factory.abstractfactory.cadeira

import br.com.guru.model.cadeira.Cadeira

interface CadeiraAbstractFactory {
    fun criarCadeira(): Cadeira
}
