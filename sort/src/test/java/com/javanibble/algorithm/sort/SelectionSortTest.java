package com.javanibble.algorithm.sort;


import java.util.Arrays;
import static org.junit.Assert.assertEquals;


import org.junit.Test;


/**
 * The SelectionSortTest class forms part of the Test Driven Development approach to test the 
 * SelectionSort class.
 */
public class SelectionSortTest {
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testSelectionSortNull() {
		int[] unsortedArray = null;
		new SelectionSort().sort(unsortedArray);
	} 
 
	@Test
	public void testSelectionSort() {
		int input[] = new int[]{6,1,7,9,3,8,2,5,4,0};
		int sorted[] = {0,1,2,3,4,5,6,7,8,9};
		SelectionSort sort = new SelectionSort();
		sort.sort(input);

		assertEquals(true, Arrays.equals(input, sorted));
	}
	
}