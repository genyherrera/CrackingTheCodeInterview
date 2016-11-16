package com.genyherrera.crackingthecodeinterview.interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListInitialized {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(2);
		
		Iterator myIterator = list.iterator();
		int index = 0;
		
		while (myIterator.hasNext() && index < list.size()) {
			System.out.println(list.get(index));
			index++;
		}
	}

}
