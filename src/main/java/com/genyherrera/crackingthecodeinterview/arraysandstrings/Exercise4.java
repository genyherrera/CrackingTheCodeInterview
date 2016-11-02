package com.genyherrera.crackingthecodeinterview.arraysandstrings;

/**
 * @problem: Given a string, write a function to check if it is a permutation of
 *			 a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A
 *			 permutation is a rearrangement of letters. The palindrome does not need to be limited to just
 *			 dictionary words.
 *
 *			 EXAMPLE:
 * 			 Input: Tact Coa
 * 			 Output: True (permutations: "taco cat'; "atc o eta·; etc.)
 * @assumptions: The English alphabet is composed of 26 characters.
 * @author geny.herrera
 */
public class Exercise4 {

	/**
	 * isPermutationOfPalindrome - method to to check if a string is a permutation of a palindrome
	 * @param value
	 * @return Boolean value that verify if a string is a permutation of a palindrome
	 */
	public Boolean isPermutationOfPalindrome(String value) {
		//Validation step 
		if (value == null) return null; 

		int countOdd = 0;

		int[] table = new int[26];

		for (char letter : value.toCharArray()) {
			if (getCharNumber(letter) != -1) {
				table[getCharNumber(letter)]++;
				if (table[getCharNumber(letter)] % 2 == 1) {
					countOdd++;
				} else {
					countOdd--;
				}
			}
		}
		return countOdd <= 1;
	}

	/**
	 * Map each character to a number. a -> 0, b -> 1, c -> 2, etc.
	 * This is case insensitive. Non-letter characters map to -1.
	 * @param c
	 * @return integer value for all letter characters. All non-letter characters return -1.
	 */
	private int getCharNumber(Character letter) {
		int integerA = Character.getNumericValue('a');
		int integerZ = Character.getNumericValue('z');
		int integerLetter = Character.getNumericValue(letter);
		if (integerLetter >= integerA && integerLetter <= integerZ) {
			return integerLetter - integerA; //a -> 0, b -> 1, c -> 2, etc
		}
		return -1;
	}
}
