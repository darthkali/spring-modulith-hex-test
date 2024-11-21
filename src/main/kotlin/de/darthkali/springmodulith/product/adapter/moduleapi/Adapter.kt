package de.darthkali.springmodulith.product.adapter.moduleapi

import de.darthkali.springmodulith.product.adapter.moduleapi.ProductDto.Companion.toDto
import de.darthkali.springmodulith.product.domain.ports.inbound.ForProducts

class Adapter(private val forProducts: ForProducts):ForModuleProducts {
    override fun getModuleProducts(): List<ProductDto> {
        return forProducts.getProducts().map { product -> product.toDto() }
    }
}