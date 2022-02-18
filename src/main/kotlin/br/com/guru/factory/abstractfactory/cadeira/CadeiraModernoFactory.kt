package br.com.guru.factory.abstractfactory.cadeira

import br.com.guru.model.cadeira.Cadeira
import br.com.guru.model.cadeira.CadeiraModerno

class CadeiraModernoFactory : CadeiraAbstractFactory {
    override fun criarCadeira(): Cadeira {
        return CadeiraModerno()
    }
}