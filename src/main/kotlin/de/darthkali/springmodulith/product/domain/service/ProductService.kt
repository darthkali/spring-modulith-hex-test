package de.darthkali.springmodulith.product.domain.service

import de.darthkali.springmodulith.product.adapter.dto.ProductDto
import de.darthkali.springmodulith.product.adapter.dto.ProductDto.Companion.toDto
import de.darthkali.springmodulith.product.domain.model.Product
import de.darthkali.springmodulith.product.domain.ports.inbound.OpenPort
import org.springframework.stereotype.Service


@Service
class ProductService(): OpenPort {
    override fun getProducts(): List<Product> {
        return listOf(
            Product("P1", "D1", 5),
        )
    }

    override fun getProductsDto(): List<ProductDto> {
        return listOf(
            Product("P1", "D1", 5).toDto(),
        )
    }
}