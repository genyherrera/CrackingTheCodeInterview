package com.genyherrera.crackingthecodeinterview.arraysandstrings;

import java.util.Arrays;

/**
 * @problem: Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
 * @questions: You should clarify if the strings are in ASCII (128 characters) or EASCII(256 characters), if our logic need to be case sensitive or not,
 * 			   and if whitespace matters or not.
 * @assumptions: 1. We'll assume the character set is ASCII (128 characters) 
 * 				 2. Our logic must be case sensitive.
 * 				 3. Whitespace matters 
 * @author geny.herrera
 *
 */
public class Exercise2 {
	
	/**
	 * isPermutation - method to find on given two String if one is permutation of the other
	 * @param value1, value2
	 * @return if the two String are permutations each other
	 */
	public Boolean isPermutation(String value1, String value2) {
		//Validation step 
		if (value1 == null || value2 == null || value1.length() != value2.length()) return false;
		
		char[] value1CharArray = value1.toCharArray();
		char[] value2CharArray = value2.toCharArray();
		
		Arrays.sort(value1CharArray);
		Arrays.sort(value2CharArray);
		
		return Arrays.equals(value1CharArray, value2CharArray);
	}
	
	/**
	 * isPermutationOptimized - method to find if a string has only unique characters (optimized method)
	 * @param value1, value2
	 * @return if the two String are permutations each other
	 */
	public Boolean isPermutationOptimized(String value1, String value2) {
		//Validation step 
		if (value1 == null || value2 == null || value1.length() != value2.length()) return false;
		
		int[] ascii_char_list = new int[128];
		
		for (char letterInValue1 : value1.toCharArray()) {
			ascii_char_list[(int) letterInValue1]++;
		}
		
		for (char letterInValue2 : value2.toCharArray()) {
			if (ascii_char_list[(int) letterInValue2] == 0) return false;
			ascii_char_list[(int) letterInValue2]--;
		}
		return true;
	}
}
