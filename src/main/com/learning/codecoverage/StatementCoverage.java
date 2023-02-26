package com.learning.codecoverage;

/**
 * Statement coverage is to run each executable statement
 * in the program’s code at least once. It’s also often called line coverage
 */
public class StatementCoverage {

    public String sum(int a, int b) {
        int result = a + b;
        if (result > 0) {
            return "Greater than Zero";
        } else if (result < 0) {
            return "Less than Zero";
        } else {
            return "Zero";
        }
    }
}
