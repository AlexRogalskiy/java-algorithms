package com.javanibble.algorithm.math.euclid;


/**
 * The GreatestCommonDivisor class is used to calculate the g.c.d. of two positive integers, m ≥ n ≥ 0. To 
 * solve this, the class makes use of Euclid's Algorithm.
 * 
 * Precondition: Consider two positive integers 'm' and 'n' such that m ≥ n ≥ 0.
 * Step 1: Divide m by n, and let the remainder be r.
 * Step 2: If r = 0, the algorithm ends, n is the GCD.
 * Step 3: Set m -> n, n -> r, repeat from step 1 until r = 0;
 */
public class GreatestCommonDivisor {

	
    public static int gcd(int p, int q) {
    		if (p > q) {
    			if ((p % q) == 0) 
               return q;
            else
               return gcd(q, p % q);
    		
    		} else {
    			if ((q % p) == 0) 
    				return p;
    			else
    				return gcd(p, q % p);
    		}
    }
    
    
    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++) {
            for (int m = 1; m <= 10; m++) {
                System.out.println("n: " + n + " m: " + m + " gcd: " + gcd(n, m));
            }
        }
    }
	
}
