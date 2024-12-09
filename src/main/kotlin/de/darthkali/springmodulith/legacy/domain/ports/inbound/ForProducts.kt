package de.darthkali.springmodulith.legacy.domain.ports.inbound

import de.darthkali.springmodulith.legacy.domain.model.Product

interface ForProducts {
    fun getProducts(): List<Product>
}