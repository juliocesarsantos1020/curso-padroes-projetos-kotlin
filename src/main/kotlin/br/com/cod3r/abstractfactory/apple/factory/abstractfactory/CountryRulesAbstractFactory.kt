package br.com.cod3r.abstractfactory.apple.factory.abstractfactory

import br.com.cod3r.abstractfactory.apple.model.certificate.Certificate
import br.com.cod3r.abstractfactory.apple.model.packing.Packing

interface CountryRulesAbstractFactory {
    fun getCertificates(): Certificate
    fun getPacking(): Packing
}
