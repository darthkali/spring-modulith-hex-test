package de.darthkali.springmodulith.shoppingcard.domain.service

import de.darthkali.springmodulith.product.adapter.inbound.ClosedPort
import de.darthkali.springmodulith.product.domain.ports.inbound.OpenPort
import de.darthkali.springmodulith.shoppingcard.domain.model.ShoppingCardProduct

class ShoppingCardService(
    private val forModuleProducts: OpenPort,
    private val closedPort: ClosedPort
) {

    fun loadProducts(): List<ShoppingCardProduct> {
        return forModuleProducts.getProductsDto().map { ShoppingCardProduct(
            name = it.name,
            description = it.description,
            price = it.price
        ) }
    }
}


