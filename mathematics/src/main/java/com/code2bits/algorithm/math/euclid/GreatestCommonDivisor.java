/**
 * MIT License
 * 
 * Copyright (c) 2018 André Maré
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.code2bits.algorithm.math.euclid;


/**
 * The GreatestCommonDivisor class is used to calculate the g.c.d. of two positive integers, m ≥ n ≥ 0. To 
 * solve this, the class makes use of Euclid's Algorithm.
 * 
 * Precondition: Consider two positive integers 'm' and 'n' such that m ≥ n ≥ 0.
 * Step 1: Divide m by n, and let the remainder be r.
 * Step 2: If r = 0, the algorithm ends, n is the GCD.
 * Step 3: Set m -> n, n -> r, repeat from step 1 until r = 0;
 * 
 * @author	André Maré
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
