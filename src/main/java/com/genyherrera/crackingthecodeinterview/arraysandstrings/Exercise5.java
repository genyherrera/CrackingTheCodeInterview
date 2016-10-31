package com.genyherrera.crackingthecodeinterview.arraysandstrings;

/**
 * @problem: One Away: There are three types of edits that can be performed on strings: insert a character,
 * 			 remove a character, or replace a character. Given two strings, write a function to check if they are
 * 			 one edit (or zero edits) away.
 * 
 * 			 EXAMPLE:
 * 			 pale, ple -> true
 *  		 pales, pale -> true
 *			 pale, bale -> true
 * 			 pale, bae -> false
 * @author geny.herrera
 */
public class Exercise5 {

	/**
	 * isOneActionAway - method to verify if two given strings are one action away 
	 * @param value1
	 * @param value2
	 * @return if two given strings are one action away 
	 */
	public boolean isOneActionAway(String value1, String value2) {
		if (Math.abs(value1.length() - value2.length()) > 1) return false;

		if (value1.length() == value2.length()) {
			return checkEdit(value1,value2);
		}
		if (value1.length() != value2.length()) {
			return checkInsertRemove(value1,value2);
		}

		return false;
	}

	/**
	 * checkEdit - method to verify if two given string has only one edit
	 * @param value1
	 * @param value2
	 * @return if two given strings has only one edit
	 */
	private boolean checkEdit(String value1, String value2) {
		boolean foundEdit = false;
		
		if (value1.equals(value2)) return false;

		for(int i = 0; i < value1.length(); i++) {
			if (value1.charAt(i) != value2.charAt(i)) {
				if (foundEdit) {
					return false;
				}
				foundEdit = true;	
			}
		}
		return true;			
	}

	/**
	 * checkInsertRemove - method to verify if two given strings has only one modification either insert or delete.
	 * @param value1
	 * @param value2
	 * @return if two given strings has only one modification either insert or delete
	 */
	private boolean checkInsertRemove(String value1, String value2) {
		String small = value1.length() > value2.length() ? value2 : value1;
		String greater = value1.length() > value2.length() ? value1 : value2;

		boolean foundInsertRemove = false;
		int countSmaller = 0;

		for(int i = 0; i < small.length(); i++) {
			if (small.charAt(countSmaller) != greater.charAt(i)) {
				if (foundInsertRemove) {
					return false;
				}
				foundInsertRemove = true;
				countSmaller = i;
			} else {
				countSmaller++;
			}
		}
		return true;
	}
}
