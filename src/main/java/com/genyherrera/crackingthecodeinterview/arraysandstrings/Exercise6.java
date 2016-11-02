package com.genyherrera.crackingthecodeinterview.arraysandstrings;

/**
 * @problem: String Compression: Implement a method to perform basic string compression using the counts
 *			 of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
 * 			 "compressed" string would not become smaller than the original string, your method should return
 * 			 the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 * @author geny.herrera
 */
public class Exercise6 {

	/**
	 * compression - method to to compress a string and return the smallest string (original or compressed)
	 * @param value
	 * @return return the smallest string (original or compressed)
	 */
	public String compression(String value) {
		StringBuilder result = new StringBuilder();
		int count = 0;

		for(int i = 0; i < value.length(); i++) {
			count++;
			if (i == value.length() - 1 || value.charAt(i) != value.charAt(i + 1)) {
				result.append(value.charAt(i));
				result.append(count);
				count = 0;
			}
		}
		return result.length() < value.length() ? result.toString() : value;
	}
}
