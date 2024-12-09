package de.darthkali.springmodulith.product.adapter.moduleapi

import de.darthkali.springmodulith.legacy.adapter.moduleapi.ProductDto

interface ForModuleProducts {
    fun getModuleProducts(): List<ProductDto>
}