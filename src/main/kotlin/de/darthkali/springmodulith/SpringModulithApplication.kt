package de.darthkali.springmodulith

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringModulithApplication

fun main(args: Array<String>) {
    runApplication<SpringModulithApplication>(*args)
//        .getBean(ProductService::class.java)
//        .create(Product("Test", "Desc", 10));
}

