package com.genyherrera.crackingthecodeinterview.linkedlists;

import java.util.HashSet;

import com.genyherrera.crackingthecodeinterview.auxiliar.LinkedListNode;

/**
 * @problem: Remove Dups: Write code to remove duplicates from an unsorted linked list.
 * 			 FOLLOW UP
 * 			 How would you solve this problem if a temporary buffer is not allowed?
 * @author geny.herrera
 *
 */
public class Exercise1 {

	/**
	 * removeDuplicatesWithBuffer - This method is to remove duplicates from a LinkedList.
	 * In order to do that, that method create a new buffer (HasSet) that store all non duplicate elements.
	 * @param header
	 * @return new HashSet without duplicate elements
	 */
	@SuppressWarnings("rawtypes")
	public HashSet removeDuplicatesWithBuffer(LinkedListNode header) {
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedListNode previous = null;
		while (header != null) {
			if (set.contains(header.data)) {
				previous.next = header.next;
			} else {
				set.add(header.data);
				previous = header;
			}
			header = header.next;
		}
		
		return set;
	}

	/**
	 * removeDuplicatesWithoutBuffer - method to remove duplicated values inside a LinkedList without using any additional buffer.
	 * @param header
	 * @return the LinkedList without the duplicated elements 
	 */
	public LinkedListNode removeDuplicatesWithoutBuffer(LinkedListNode header) {
		LinkedListNode current = header;

		while (current != null) {
			/* Remove all future nodes that have the same value */
			LinkedListNode runner = current;
			while (runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}

		return header;
	}
}
