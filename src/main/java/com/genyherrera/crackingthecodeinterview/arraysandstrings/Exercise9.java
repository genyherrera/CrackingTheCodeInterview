package com.genyherrera.crackingthecodeinterview.arraysandstrings;

/**
 * String Rotation: Assume you have a method isSubstring which checks if one word is a substring
 * 					of another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one
 * 					call to isSubstring (e.g., "waterbottle" is a rotation of "erbottlewat").
 * @author geny.herrera
 */
public class Exercise9 {

	/**
	 * isRotation - Method to check in two given string if one is rotation of other
	 * @param s1
	 * @param s2
	 * @return if a string is a rotation of other string
	 */
	public boolean isRotation(String s1, String s2) {
		if (s1.length() != s2.length()) return false;
		return isSubstring(s1+s1, s2);
	}
	
	/**
	 * isSubstring
	 * @param s1
	 * @param s2
	 * @return
	 */
	private boolean isSubstring(String s1, String s2) {
		return s1.contains(s2); 
	}
}