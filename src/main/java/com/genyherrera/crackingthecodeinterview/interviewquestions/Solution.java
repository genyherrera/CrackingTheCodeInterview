package com.genyherrera.crackingthecodeinterview.interviewquestions;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Solution {

	public static void main(String[] args) {
		//printStairs(6);
		
		/** JAVASCRIPT */
		//printRestOfDivision();
		
		/** JAVA CODE**/
		//printOrderedCount("fish red blue fish");
		//countRemoveLetter("aBCDefGHabcAop");
	}

	private static void printRestOfDivision() {
		for (int i = 0; i < 11; i++) {
			System.out.println(i+": " + i%2);
		}
		
	}

	private static void printStairs(int num) {
		for (int i = 0; i < num; i++) {  // Do it 6 times (rows)
			for (int j = 1; j <= num; j++) { // Column
				System.out.print(i < num-j ?" ":"#");
			}
			System.out.println();
		}
	}

	/**
	 * Given the following String (fish red blue fish)
	 * print in order format with count
	 * Eg: blue - 1; fish - 2; red - 1;  
	 * @param value
	 */
	private static void printOrderedCount(String value) {
		Map<String, Integer> myMap = new TreeMap<String, Integer>();
		for(String word : value.split(" ")) {
			if (myMap.containsKey(word)) {
				myMap.put(word, myMap.get(word)+1);
			} else {
				myMap.put(word, 1); 
			}
		}
		for (Entry<String,Integer> mapValue : myMap.entrySet()) {
			System.out.print(mapValue.getKey() + " - " + mapValue.getValue() + "; ");
		}
	}
	
	/**
	 * Given a String remove all the a's and return the difference of length 
	 * @param value
	 */
	private static void countRemoveLetter(String value) {
		 System.out.println(value.length() - value.replaceAll("(?i)a", "").length());
	}

}