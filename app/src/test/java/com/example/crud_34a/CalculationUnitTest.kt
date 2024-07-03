package com.example.crud_34a

import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.`when`

class CalculationUnitTest {

    @Test
    fun checksum(){
        var calculations = Calculations()
        var result = calculations.add(5,5)
        assertEquals(10,result)
    }

    //Given calculations class
    //when user inputs two number 5+5
    //then returns 10

    @Test
    fun check_sum_using_mockito(){
        var calculations = mock(Calculations::class.java)

        `when`(calculations.add(2,3)).thenReturn(5)

        assertEquals(calculations.add(2,3),5)

    }
}