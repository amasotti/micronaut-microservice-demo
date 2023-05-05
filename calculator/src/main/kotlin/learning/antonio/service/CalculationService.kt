/*
File: CalculationService
Author: Antonio Masotti <masotti@bikeleasing.de>
Date: 05.05.23
*/

package learning.antonio.service

import jakarta.inject.Singleton
import kotlin.random.Random

@Singleton
class CalculationService {

    private val VAT_FACTOR = 1.19

    val randomInt = Random.nextInt(0,5)

    fun calculate(bikePrice: Double, leasingTime: Int) : Double {

        if (randomInt == 3) {
            throw Exception("Random exception")
        }

        val leasingFactor = getLeasingFactor(leasingTime)
        return bikePrice * leasingFactor * VAT_FACTOR
    }

    private fun getLeasingFactor(leasingTime: Int) : Double {
        return when (leasingTime) {
            in 1..30 -> 0.03
            in 31..40 -> .028
            else -> 0.05
        }
    }

}