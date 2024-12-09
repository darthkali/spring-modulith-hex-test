package de.darthkali.springmodulith.product.adapter.dto

import de.darthkali.springmodulith.legacy.adapter.moduleapi.ProductDto
import de.darthkali.springmodulith.legacy.domain.model.Product

data class ProductDto(
     val name: String,
     val description: String,
     val price: Int
) {
     companion object {
          fun Product.toDto(): ProductDto {
               return ProductDto(this.name, this.description, this.price)
          }
     }
}