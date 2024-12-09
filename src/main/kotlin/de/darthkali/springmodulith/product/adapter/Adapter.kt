package de.darthkali.springmodulith.product.adapter

import de.darthkali.springmodulith.product.adapter.dto.ProductDto
import de.darthkali.springmodulith.product.adapter.dto.ProductDto.Companion.toDto
import de.darthkali.springmodulith.product.domain.model.Product
import de.darthkali.springmodulith.product.domain.ports.inbound.OpenPort

class Adapter(private val openPort: OpenPort): OpenPort {
    override fun getProducts(): List<Product> {
        return openPort.getProducts().map { product -> product }
    }

    override fun getProductsDto(): List<ProductDto> {
        return openPort.getProducts().map { product -> product.toDto() }
    }
}