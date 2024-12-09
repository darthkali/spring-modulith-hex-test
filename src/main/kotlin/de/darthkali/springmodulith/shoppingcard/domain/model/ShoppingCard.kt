package de.darthkali.springmodulith.shoppingcard.domain.model

import de.darthkali.springmodulith.legacy.domain.model.ShoppingCardProduct


data class ShoppingCard (
    val shoppingCardProducts: List<ShoppingCardProduct>
)