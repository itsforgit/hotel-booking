package com.learning.codecoverage;

public class TestCoverage {
    public static void main(String[] args) {
        BranchCoverage branchCoverage=new BranchCoverage();
        branchCoverage.OddOrEven(10);
        branchCoverage.OddOrEven(9);
    }
}
