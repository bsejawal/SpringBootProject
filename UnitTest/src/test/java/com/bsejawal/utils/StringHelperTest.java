package com.bsejawal.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bsejawal.AbstractTest;

public class StringHelperTest extends AbstractTest {
	StringHelper helper = new StringHelper();

	@Test
	public void testWith2CharsIsReversed() {
		assertEquals("BA", helper.swapLastTwoChars("AB"));
	}

	@Test
	public void testWith4Chars() {
		assertEquals("ABDC", helper.swapLastTwoChars("ABCD"));
	}

	@Test
	public void testWith10Chars() {
		assertEquals("ABCDEFGHJI", helper.swapLastTwoChars("ABCDEFGHIJ"));
	}
	
	@Test
	public void testWith1Chars() {
		assertEquals("A", helper.swapLastTwoChars("A"));
	}
	
	@Test
	public void testWith0Chars() {
		assertEquals("", helper.swapLastTwoChars(""));
	}
	
	
	//Remove	
	@Test 
	public void testStringHavingAInFirstCharacterOnly(){
		assertEquals("BCD", helper.removeAInFirst2Chars("ABCD"));
	}
	
	@Test 
	public void testStringHavingNoAInFirst2Chars(){
		assertEquals("BBAA", helper.removeAInFirst2Chars("BBAA"));		
	}
	
	@Test 
	public void testStringHavingAInFirst2CharsAnd4Char(){
		assertEquals("BBA", helper.removeAInFirst2Chars("ABBA"));		
	}
	
	@Test 
	public void testStringWith2Chars(){
		assertEquals("B", helper.removeAInFirst2Chars("AB"));		
	}
	
	@Test 
	public void testStringWith1Chars(){
		assertEquals("B", helper.removeAInFirst2Chars("B"));		
	}
	
	@Test 
	public void testStringWithAAs1Chars(){
		assertEquals("", helper.removeAInFirst2Chars("A"));		
	}
	
	@Test 
	public void testStringWithEmptyString(){
		assertEquals("", helper.removeAInFirst2Chars(""));		
	}

}
