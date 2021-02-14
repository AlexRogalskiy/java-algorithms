package com.javanibble.algorithm;

public class EuclideanAlgorithm {

	
    public int gcdRecursion(int dividend, int divisor) {
        int remainder = dividend % divisor;

        if (remainder != 0) {
            return gcdRecursion(divisor, remainder);
        } else {
            return divisor;
        }
    }


    public int gcdLoop(int dividend, int divisor) {
        while (divisor != 0) {
            int temp = divisor;
            divisor = dividend % divisor;
            dividend = temp;
        }
        return dividend;
    }
	
}
