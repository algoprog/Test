package com.algoprog.tests;

import com.algoprog.RevenueCalculator;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RevenueCalculatorTest {
    /**
     * Tests the method for 20% margin and 400 cost of goods with expected revenue value 500
     */
    @Test
    void calculateRevenue() {
        BigDecimal revenue = RevenueCalculator.calculateRevenue(BigDecimal.valueOf(0.2), BigDecimal.valueOf(400));
        assertEquals(0, revenue.compareTo(BigDecimal.valueOf(500)));
    }

    /**
     * Tests the method for not permitted values of margin and cost of goods
     */
    @Test
    void calculateRevenueArithmeticException() {
        assertThrows(ArithmeticException.class, ()-> RevenueCalculator.calculateRevenue(BigDecimal.valueOf(1.0), BigDecimal.valueOf(400)));
        assertThrows(ArithmeticException.class, ()-> RevenueCalculator.calculateRevenue(BigDecimal.valueOf(2.0), BigDecimal.valueOf(400)));
        assertThrows(ArithmeticException.class, ()-> RevenueCalculator.calculateRevenue(BigDecimal.valueOf(0.2), BigDecimal.valueOf(-400)));
    }
}