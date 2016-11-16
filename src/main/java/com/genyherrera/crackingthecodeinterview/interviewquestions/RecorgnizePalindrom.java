package com.genyherrera.crackingthecodeinterview.interviewquestions;

import java.util.HashSet;
import java.util.Set;

public class RecorgnizePalindrom {
	
	public static void main(String[] args) {
		Set<String> mySet = new HashSet<String>();
		mySet.add("abba");
		mySet.add("civic");
		mySet.add("legal");
		
		printAllPalindroms(mySet);
	}


	private static void printAllPalindroms(Set<String> mySet) {
		for (String value : mySet) {
			if (isPalindrome(value)) {
				System.out.println(value);
			}
		}
		
	}


	private static boolean isPalindrome(String prefix) {
		return new StringBuilder(prefix).reverse().toString().equals(prefix);
	}

}
