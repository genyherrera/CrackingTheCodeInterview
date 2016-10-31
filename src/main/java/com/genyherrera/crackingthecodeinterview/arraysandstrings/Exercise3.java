package com.genyherrera.crackingthecodeinterview.arraysandstrings;

/**
 * @problem: URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
 *           has sufficient space at the end to hold the additional characters, and that you are given the "true"
 * 			 length of the string. (Note: if implementing in Java, please use a character array so that you can
 * 			 perform this operation in place.)
 * @author geny.herrera
 *
 */
public class Exercise3 {
	
	/**
	 * urlifyString - method to replace all spaces in a string with '%20'
	 * @param value
	 * @param trueLength
	 * @return String with all spaces replaced with '%20'
	 */
	public String urlifyString(String value, int trueLength) {
		//Validation step 
		if (value == null || trueLength > value.length()) return null; 

		
		int spaces = 0;
		
		for (int i = 0; i < trueLength; i++) {
			if (value.charAt(i) == ' ') {
				spaces++;									
			}
		}
		
		int index = spaces * 2 + trueLength;
		char[] finalValue = new char[index];
		
		
		for (int i = trueLength-1; i >= 0; i--) {
			if (value.charAt(i) == ' ') {
				finalValue[index - 1] = '0';
				finalValue[index - 2] = '2';
				finalValue[index - 3] = '%';
				index -= 3;
			} else {
				finalValue[index - 1] = value.charAt(i);
				index--;
			}
		}
		
		return new String(finalValue);
	}
	
	/**
	 * urlifyStringOptimized - method to replace all spaces in a string with '%20' (instead of two scans, we just implement one pass)
	 * @param value
	 * @param trueLength
	 * @return String with all spaces replaced with '%20'
	 */
	public String urlifyStringOptimized(String value, int trueLength) {
		//Validation step 
		if (value == null || trueLength > value.length()) return null; 

		StringBuilder urlifyString = new StringBuilder();
		
		for (int i = 0; i < trueLength; i++) {
			if (value.charAt(i) == ' ') {
				urlifyString.append("%20");
			} else {
				urlifyString.append(value.charAt(i));
			}
		}
		
		return new String(urlifyString);
	}
}
