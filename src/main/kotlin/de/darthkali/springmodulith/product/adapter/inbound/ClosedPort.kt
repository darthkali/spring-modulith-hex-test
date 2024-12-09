package de.darthkali.springmodulith.product.adapter.inbound

import de.darthkali.springmodulith.product.domain.model.Product

interface ClosedPort {
    fun getProducts(): List<Product>
}