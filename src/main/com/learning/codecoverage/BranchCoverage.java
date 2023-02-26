package com.learning.codecoverage;

/**
 * Branch coverage ensures if each decision in a decision-making tree is executed at least once.
 * By branches we mean: conditional statements, loops, switch statements.
 */
public class BranchCoverage {

    public String OddOrEven(int number) {

        if (number % 2 == 0)
            return number + " is even";
        else
            return number + " is odd";
    }
}
