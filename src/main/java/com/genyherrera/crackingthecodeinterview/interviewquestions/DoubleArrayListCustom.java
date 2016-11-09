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
public class DoubleArrayListCustom implements Iterator<Integer> {

    private Collection<Collection<Integer>> myList;
    private final Iterator<Collection<Integer>> myIterator;
    private Iterator<Integer> currentIterator;

    public DoubleArrayListCustom(Collection<Collection<Integer>> myList) {
        this.myList = myList;
        this.myIterator = myList.iterator();
        if (myIterator.hasNext()) {
        	currentIterator = myIterator.next().iterator();
        }
    }

    public boolean hasNext() {
        if (currentIterator == null) {
            return false;
        }
        if (!currentIterator.hasNext()) {
            while (myIterator.hasNext()) {
            	currentIterator = myIterator.next().iterator();
                if (currentIterator.hasNext()) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    public Integer next() {
        if (hasNext()) {
            return currentIterator.next();
        }
        throw new NoSuchElementException();
    }


    public void remove() {
        throw new UnsupportedOperationException();
    }

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Integer> inner1 = Arrays.asList(0,1,2,3);
		List<Integer> inner2 = Arrays.asList(4,5,6);
		List<Integer> inner3 = Arrays.asList(7,8,9,10);
		DoubleArrayListCustom doubleCollection = new DoubleArrayListCustom(Arrays.asList(inner1, inner2, inner3));

		while (doubleCollection.hasNext()) {
            Integer value = doubleCollection.next();
            System.out.println(value);
        }
	}
}
