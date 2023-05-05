package learning.antonio.service

import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import jakarta.inject.Inject
import learning.antonio.model.Bike
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


@MicronautTest
class CalculationServiceTest {

    @Inject
    lateinit var service: CalculationService

    @Test
    fun testCalculate() {
        val bikeOrder = Bike("Bike", 1500.0, 36)
        val result = service.calculate(bikeOrder)
        assertEquals(49.98, result)
    }
}