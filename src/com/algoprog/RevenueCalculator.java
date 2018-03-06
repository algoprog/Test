package com.algoprog;

import java.math.BigDecimal;

public class RevenueCalculator {

    public static BigDecimal calculateRevenue(BigDecimal marginPercentage, BigDecimal costOfGoods) {
        if(costOfGoods.compareTo(BigDecimal.ZERO) < 0) {
            throw new ArithmeticException("Cost of goods cannot be negative");
        }
        else if(marginPercentage.compareTo(BigDecimal.ONE) == 0) {
            throw new ArithmeticException("Division by zero");
        }
        else {
            return costOfGoods.divide(BigDecimal.ONE.subtract(marginPercentage));
        }
    }

}