package de.darthkali.springmodulith.product.domain.service

import de.darthkali.springmodulith.legacy.domain.model.Product
import de.darthkali.springmodulith.legacy.domain.ports.inbound.ForProducts
import org.springframework.stereotype.Service


@Service
class ProductService(): ForProducts {
    override fun getProducts(): List<Product> {
        return listOf(
            Product("P1", "D1", 5),
        )
    }
}