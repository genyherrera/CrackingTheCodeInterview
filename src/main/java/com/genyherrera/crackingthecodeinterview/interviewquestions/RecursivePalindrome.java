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
}
