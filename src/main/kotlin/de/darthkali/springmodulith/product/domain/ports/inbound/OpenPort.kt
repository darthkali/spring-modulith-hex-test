package de.darthkali.springmodulith.product.domain.ports.inbound

import de.darthkali.springmodulith.product.adapter.dto.ProductDto
import de.darthkali.springmodulith.product.domain.model.Product

interface OpenPort {
    fun getProducts(): List<Product>
    fun getProductsDto(): List<ProductDto>
}