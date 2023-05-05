package learning.antonio

import io.micronaut.runtime.Micronaut.run
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.info.*

@OpenAPIDefinition(
    info = Info(
            title = "order",
            version = "0.1",
        contact = Contact(
            name = "Antonio",
            email = "clown@zirkus.de"
    )
))

object Api {}
fun main(args: Array<String>) {
	run(*args)
}

