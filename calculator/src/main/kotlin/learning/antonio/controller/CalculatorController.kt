package learning.antonio.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import jakarta.inject.Inject
import learning.antonio.service.CalculationService

@Controller("/calculator")
class CalculatorController {

    @Inject
    private val calculationService = CalculationService()

    @Post("/", produces=["application/json"])
    fun calculate(bikePrice: Double, leasingTime: Int): Double {
        println("Calculating bike: $bikePrice")
        println("Leasing time: $leasingTime")
        return calculationService.calculate(bikePrice, leasingTime)
    }

}