package learning.antonio.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.swagger.v3.oas.annotations.parameters.RequestBody
import io.swagger.v3.oas.annotations.responses.ApiResponse
import jakarta.inject.Inject
import learning.antonio.model.Bike

@Controller("/order")
class OrderController {

    @Inject
    lateinit var calculatorClient: learning.antonio.controller.CalculatorClient

    @Get(uri="/", produces=["text/plain"])
    fun index(): String {
        return "Example Response"
    }

    @Post(uri="/", produces=["application/json"])
    @ApiResponse(responseCode = "200", description = "Ordering a bike")
    fun orderBike (@RequestBody bikeOrder: Bike): Double {
        println("Ordering bike: $bikeOrder")
        return calculatorClient.calculate(bikeOrder.price, bikeOrder.leasingTime)
    }
}