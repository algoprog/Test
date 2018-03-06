package com.algoprog;

import com.algoprog.tests.PaginationTest;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BigDecimal revenue = RevenueCalculator.calculateRevenue(BigDecimal.valueOf(0.2), BigDecimal.valueOf(400));
        System.out.println("Revenue: " + revenue.toPlainString());

        new PaginationTest().test();
    }
}
