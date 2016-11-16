package com.genyherrera.crackingthecodeinterview.interviewquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class MyList extends ArrayList<Box> {
	
	@Override
	public Iterator<Box> iterator() {
		Collections.sort(this, new Comparator<Box>() {

			@Override
			public int compare(Box o1, Box o2) {
				return Integer.compare(o1.getNumber(), o2.getNumber());
			}
		});
		return super.iterator();
    }
	
	
	/*@Override
	public boolean add(Box element) {
		boolean response = super.add(element);
		if (response) {
			Collections.sort(this, new Comparator<Box>() {

				@Override
				public int compare(Box o1, Box o2) {
					return Integer.compare(o1.getNumber(), o2.getNumber());
				}
			});
			Collections.sort(this);
		} 
		return response;
	}*/
	
	public static void main(String[] args) {
		MyList myList = new MyList();
		myList.add(new Box(5));
		myList.add(new Box(8));
		myList.add(new Box(3));
		myList.add(new Box(9));
		myList.add(new Box(0));
		myList.add(new Box(2));
		myList.add(new Box(1));
		myList.add(new Box(6));
		myList.add(new Box(4));
		myList.add(new Box(7));
		
		Iterator<Box> myIterator = myList.iterator();
		while(myIterator.hasNext()) {
			Box nextBox = myIterator.next();
			System.out.println(nextBox.getNumber());
		}
	}
}
