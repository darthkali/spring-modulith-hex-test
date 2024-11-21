package de.darthkali.springmodulith.shoppingcard.domain.service

import de.darthkali.springmodulith.product.adapter.moduleapi.ForModuleProducts
import de.darthkali.springmodulith.shoppingcard.domain.model.ShoppingCardProduct

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


