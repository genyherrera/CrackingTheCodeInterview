package com.genyherrera.crackingthecodeinterview.interviewquestions;

import java.util.HashSet;
import java.util.Set;

public class Palindrom {
	
	static Set<String> mySet = new HashSet<String>();

	public static void main(String[] args) {
		permutation("abba");
		System.out.println(mySet.size());
		for (String palindrom : mySet) {
			System.out.println(palindrom);
		}
	}

	private static void permutation(String str) {
		permutation(str, "");
	}

	private static void permutation(String str, String prefix) {
		if (str.length() == 0 && isPalindrome(prefix)) {
			mySet.add(prefix);
		} else {
			for (int i= 0; i < str.length(); i++) {
				String rem = str.substring(0, i) + str.substring(i + 1);
				permutation(rem, prefix + str.charAt(i));
			}
		}
	}

	private static boolean isPalindrome(String prefix) {
		return new StringBuilder(prefix).reverse().toString().equals(prefix);
	}

}
