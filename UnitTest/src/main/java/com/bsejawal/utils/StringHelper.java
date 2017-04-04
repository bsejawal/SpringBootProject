package com.bsejawal.utils;

public class StringHelper {

	public String swapLastTwoChars(String str) {
		int length = str.length();
		if(length < 2) return str;
		String minusStr = str.substring(0, length-2);
		char secondLast = str.charAt(length-2);
		char lastChar = str.charAt(length-1);
		return minusStr + lastChar + secondLast;
	}

	public String removeAInFirst2Chars(String str) {
		if(str.length() < 2 ) return str.replace("A", "");
		String first2Chars = str.substring(0,2);
		String afterFirst2Chars = str.substring(2);
		return first2Chars.replaceAll("A", "")+afterFirst2Chars;
	}

}
