package com.genyherrera.crackingthecodeinterview.arraysandstrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @problem: Is Unique: Implement an algorithm to determine if a string has all unique characters. 
 * 			  What if you cannot use additional data structures?
 * @questions: You should clarify if the string is an ASCII (128 characters) or EASCII(256 characters), if our logic need to be case sensitive or not
 * 			   and if whitespace matters or not.
 * @assumptions: 1. We'll assume the character set is ASCII (128 characters) 
 * 				 2. Our logic must be case insensitive.
 * 				 3. Whitespace don't matters 
 * @author geny.herrera
 *
 */
public class Exercise1 {
	
	/**
	 * isUnique - method to find if a string has only unique characters
	 * time complexity O(n) & space complexity O(1)
	 * @param value
	 * @return if the string has only unique characters
	 */
	public Boolean isUnique(String value) {
		//Validation step 
		if (value == null || value.length() > 128) return false;
		
		//Logic to find if the string has only unique characters
		boolean[] asciiCharList = new boolean[128];
		
		//toUpperCase because is case insensitive ("C" == "c") 
		//replaceAll("\\s","") because whitespace don't matters. 
		for (char letter : value.toUpperCase().replaceAll("\\s","").toCharArray()) {
			if (asciiCharList[(int) letter]) return false;
			asciiCharList[(int) letter] = true;
		}
		return true;
	}
	
	/**
	 * isUniqueUsingAPI - Method to find if a string has only unique characters
	 * @param value
	 * @return if the string has only unique characters
	 */
	public Boolean isUniqueUsingAPI(String value) {
		// We put each character of our value in a Set that don't allows duplicated values
		Set<String> items = new HashSet<String>(Arrays.asList(value.toUpperCase().replaceAll("\\s","").split("")));
		
		// If the size of our set is different that the length of our string that means that on the string are duplicated values.
		return value.length() == items.size();
	}
}
