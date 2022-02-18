package br.com.cod3r.abstractfactory.apple.factory.abstractfactory

import br.com.cod3r.abstractfactory.apple.model.certificate.BrazilianCertificate
import br.com.cod3r.abstractfactory.apple.model.certificate.Certificate
import br.com.cod3r.abstractfactory.apple.model.packing.BrazilianPacking
import br.com.cod3r.abstractfactory.apple.model.packing.Packing

class BrazilianRulesAbstractFactory : CountryRulesAbstractFactory {
    override fun getCertificates(): Certificate {
        return BrazilianCertificate()
    }

    override fun getPacking(): Packing {
        return BrazilianPacking()
    }
}
