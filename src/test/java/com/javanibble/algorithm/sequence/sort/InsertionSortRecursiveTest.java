package com.javanibble.algorithm.sequence.sort;


import java.util.Arrays;
import static org.junit.Assert.assertEquals;


import com.javanibble.algorithm.sequence.sort.InsertionSortRecursive;
import org.junit.Test;


/**
 * The InsertionSortRecursiveTest class forms part of the Test Driven Development approach to test the 
 * InsertionSort class.
 */
public class InsertionSortRecursiveTest {
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testInsertionSortRecursiveNull() {
		int[] unsortedArray = null;
		new InsertionSortRecursive().sort(unsortedArray);
	} 
 
	
	@Test
	public void testInsertionSortRecursive() {
		int input[] = new int[]{6,1,7,9,3,8,2,5,4,0};
		int sorted[] = {0,1,2,3,4,5,6,7,8,9};
		InsertionSortRecursive sort = new InsertionSortRecursive();
		sort.sort(input);

		assertEquals(true, Arrays.equals(input, sorted));
	}
	
}