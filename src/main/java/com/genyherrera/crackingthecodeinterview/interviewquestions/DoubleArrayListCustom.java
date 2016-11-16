package com.genyherrera.crackingthecodeinterview.interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * problem: Givean array list within array list, create a custom iterator to print all the children of this multiple array list in their order. 
 * 			Iterator next should automatically point to start of next array list within the parent array list to print the result
 * @author geny.herrera
 * @param <T>
 * @param <T>
 */
//TODO: NOT Complete
public class DoubleArrayListCustom {


	public static void main(String[] args) {
		ArrayList<Integer> inner1 = new ArrayList<Integer>(Arrays.asList(0,1,2));
		ArrayList<Integer> inner2 =  new ArrayList<Integer>(Arrays.asList(3,4,5));
		ArrayList<Integer> inner3 =  new ArrayList<Integer>(Arrays.asList(6,7,8));
		ArrayList<Integer> inner4 =  new ArrayList<Integer>(Arrays.asList(9,10,11));
		ArrayList<Integer> inner5 =  new ArrayList<Integer>(Arrays.asList(12,13,14));
		ArrayList<Integer> inner6 =  new ArrayList<Integer>(Arrays.asList(15,16,17));

		ArrayList<ArrayList<Integer>> doubleList = new ArrayList<ArrayList<Integer>>(); 
		doubleList.add(inner1);
		doubleList.add(inner2);
		doubleList.add(inner3);
		doubleList.add(inner4);
		doubleList.add(inner5);
		doubleList.add(inner6);

		Iterator<ArrayList<Integer>> outterIterator = doubleList.iterator();

		while(outterIterator.hasNext()) {
			Iterator<Integer> innerIterator = outterIterator.next().iterator();

			while (innerIterator.hasNext()) {
				System.out.println(innerIterator.next());
			}
		}

	}


}
