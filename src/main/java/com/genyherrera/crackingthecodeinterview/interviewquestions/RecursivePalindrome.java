package com.genyherrera.crackingthecodeinterview.interviewquestions;

/**
 * @problem: Implement a recursive palindrome checker
 * @author geny.herrera
 */
public class RecursivePalindrome {


	public static void main(String[] args) {
		System.out.println(isPalindromeRecursive("racecar"));
	}

	private static boolean isPalindrome(String value) {
		return value.equals(new StringBuilder(value).reverse().toString());
	}

	private static boolean isPalindromeRecursive(String str) {
		if (str.length() == 0 || str.length() == 1){
			return true;
		} 
		return (str.charAt(0) == str.charAt(str.length() - 1)) && isPalindromeRecursive(str.substring(1, str.length()-1));
	}
	
	private static void createAllPermutations(String str) {
		createAllPermutations(str, "");
	}

	private static void createAllPermutations(String str, String prefix) {
		if (str.length() == 0 && isPalindrome(prefix)) {
			System.out.println(prefix);
		} else {
			for (int i= 0; i < str.length(); i++) {
				String rem = str.substring(0, i) + str.substring(i + 1);
				createAllPermutations(rem, prefix + str.charAt(i));
			}
		}
	}
}
