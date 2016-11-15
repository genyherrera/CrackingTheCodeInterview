package com.genyherrera.crackingthecodeinterview.interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SearchingAlgorithm {

	public static void main(String[] args) {
		String value = "racecar";
		System.out.println(isPalindrome(value));
		
		List<String> setValue = new ArrayList<String>(Arrays.asList("r","a","c","e","c","a","r"));
		System.out.println(isPalindromeRecursive(setValue));
	}
	
	public static boolean isPalindrome(String value) {
		return new StringBuilder(value).reverse().toString().equals(value);
	}
	
	public static boolean isPalindromeRecursive(String value) {
		return value.length() <= 1 ? true : value.charAt(0) == value.charAt(value.length() - 1) && isPalindromeRecursive(value.substring(1, value.length() - 1)) ? true : false;
	}
	
	public static boolean isPalindrome(List<String> setValue) {
		List<String> tmpList = new ArrayList(setValue); 
		Collections.reverse(tmpList);
		return Arrays.equals(tmpList.toArray(), setValue.toArray());
		
	}
	
	public static boolean isPalindromeRecursive(List<String> setValue) {
		return setValue.size() <= 1 ? true : setValue.get(0) == setValue.get(setValue.size() - 1) && isPalindromeRecursive(setValue.subList(1, setValue.size() - 1)) ? true : false;
	}
	
}
