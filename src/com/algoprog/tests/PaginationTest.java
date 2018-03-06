package com.algoprog.tests;

import com.algoprog.Pagination;
import com.algoprog.Result;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PaginationTest {

    @Test
    public void test() {
        ArrayList<Result> results = new ArrayList<>();
        for(int i=0; i<20; i++) {
            results.add(new Result("href "+i, "title "+i, "summary "+i));
        }
        try {
            Pagination p = new Pagination(results, 5);
            p.showResults(0);
            int next = p.nextPage(0);
            int previous = p.previousPage(5);

            assertEquals(2, next); // check next page number
            assertEquals(1, previous); // check previous page number

            assertThrows(Exception.class, ()->{
                Pagination p2 = new Pagination(null, 5); // check null results
            });

            assertThrows(Exception.class, ()->{
                Pagination p2 = new Pagination(results, 0); // check zero page size
            });
        } catch (Exception e) {
            fail("Pagination test failed");
        }
    }
}