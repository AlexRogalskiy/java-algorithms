package com.javanibble.algorithm.sort;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;


/**
 * The BubbleSortTest class forms part of the Test Driven Development approach to test the 
 * BubbleSort class.
 */
public class BubbleSortRecursiveTest {

	
	@Test(expected = IllegalArgumentException.class)
	public void testBubbleSortNull() {
		int[] unsortedArray = null;
		new BubbleSortRecursive().sort(unsortedArray);
	} 
 
	@Test
	public void testBubbleSort() {
		int input[] = new int[]{6,1,7,9,3,8,2,5,4,0};
		int sorted[] = {0,1,2,3,4,5,6,7,8,9};
		BubbleSortRecursive sort = new BubbleSortRecursive();
		sort.sort(input);

		assertEquals(true, Arrays.equals(input, sorted));
	}
	
}
