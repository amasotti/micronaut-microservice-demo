package learning.antonio.controller

import io.micronaut.http.annotation.Post
import io.micronaut.http.client.annotation.Client
import io.micronaut.retry.annotation.Retryable
import jakarta.inject.Singleton

@Client("calculator")
@Singleton
interface CalculatorClient {

    //@Retryable( delay = "1s", attempts = "3")
    @Post("/calculator")
    fun calculate(bikePrice: Double, leasingTime: Int) : Double
}