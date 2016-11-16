package com.genyherrera.crackingthecodeinterview.interviewquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrinUnsortedList {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(5);
		myList.add(8);
		myList.add(3);
		myList.add(9);
		myList.add(0);
		myList.add(2);
		myList.add(1);
		myList.add(6);
		myList.add(4);
		myList.add(7);

		printInOder(myList);
	}

	private static void printInOder(List<Integer> myList) {
		Collections.sort(myList, new Comparator<Integer>() {
			
			public int compare(Integer v1, Integer v2) {
				return Integer.compare(v1, v2);
			}
		});
		for (Integer value : myList) {
			System.out.println(value);
		}
		
	}

}
