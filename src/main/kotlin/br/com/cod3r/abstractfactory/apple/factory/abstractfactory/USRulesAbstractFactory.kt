package br.com.cod3r.abstractfactory.apple.factory.abstractfactory

import br.com.cod3r.abstractfactory.apple.model.certificate.Certificate
import br.com.cod3r.abstractfactory.apple.model.certificate.USCertificate
import br.com.cod3r.abstractfactory.apple.model.packing.Packing
import br.com.cod3r.abstractfactory.apple.model.packing.USPacking

class USRulesAbstractFactory : CountryRulesAbstractFactory {
    override fun getCertificates(): Certificate {
        return USCertificate()
    }

    override fun getPacking(): Packing {
        return USPacking()
    }
}
