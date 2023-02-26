package com.learning.codecoverage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StatementCoverageTest {
    /**
     * Method under test: {@link StatementCoverage#sum(int, int)}
     */
    @Test
    void testSum() {
        assertEquals("Greater than Zero", (new StatementCoverage()).sum(1, 1));
        assertEquals("Zero", (new StatementCoverage()).sum(-1, 1));
        assertEquals("Less than Zero", (new StatementCoverage()).sum(Integer.MIN_VALUE, 1));
    }
}

