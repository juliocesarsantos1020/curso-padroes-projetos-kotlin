package br.com.guru.factory.abstractfactory.cadeira

import br.com.guru.model.cadeira.Cadeira
import br.com.guru.model.cadeira.CadeiraVitoriano

class CadeiraVitorianoFactory : CadeiraAbstractFactory {
    override fun criarCadeira(): Cadeira {
        return CadeiraVitoriano()
    }
}