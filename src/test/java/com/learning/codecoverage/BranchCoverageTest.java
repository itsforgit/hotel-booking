package com.learning.codecoverage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BranchCoverageTest {
    /**
     * Method under test: {@link BranchCoverage#OddOrEven(int)}
     */
    @Test
    void testOddOrEven() {
        assertEquals("10 is even", (new BranchCoverage()).OddOrEven(10));
        assertEquals("1 is odd", (new BranchCoverage()).OddOrEven(1));
    }
}

