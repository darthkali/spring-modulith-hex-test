package de.darthkali.springmodulith.legacy.domain.service

import de.darthkali.springmodulith.legacy.adapter.moduleapi.ForModuleProducts
import de.darthkali.springmodulith.legacy.domain.model.ShoppingCardProduct

class ShoppingCardService(
    private val forModuleProducts: ForModuleProducts
) {

    fun loadProducts(): List<ShoppingCardProduct> {
        return forModuleProducts.getModuleProducts().map { ShoppingCardProduct(
            name = it.name,
            description = it.description,
            price = it.price
        ) }
    }
}


