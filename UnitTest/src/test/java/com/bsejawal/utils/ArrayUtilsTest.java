package com.bsejawal.utils;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

import com.bsejawal.AbstractTest;

public class ArrayUtilsTest extends AbstractTest {

	@Test
	public void testArraySort_RandomArray(){
		int numbers[] = {12, 3, 4, 1};
		int expected[] = {1, 3, 4, 12};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	
	@Test(expected = NullPointerException.class)
	public void testArraySortNullArray(){
		int numbers[] = null;
		Arrays.sort(numbers);
	}
	
	@Test(timeout = 1000)
	public void testArraySortPerformance(){
		int arrays[] = {12,23, 4};
		for(int i=0; i<1000000; i++){
			arrays[0] = i;
			Arrays.sort(arrays);
		}
	}
	
	
	
}
