package com.genyherrera.crackingthecodeinterview.linkedlists;

import java.util.ArrayList;
import java.util.List;

import com.genyherrera.crackingthecodeinterview.auxiliar.LinkedListNode;

/**
 * @problem: Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
 * @author geny.herrera
 *
 */
public class Exercise2 {

	// --------------------------------- SOLUTION 1 --------------------------------- //
	/**
	 * kthTolastWithBuffer - This method store every node in a list and the retrieve the k element by (list.size() - k)
	 * @param head
	 * @param k
	 * @return the kth to last element on a singly linked list 
	 */
	public LinkedListNode kthToLastWithBuffer(LinkedListNode head, int k) {
		List<LinkedListNode> list = new ArrayList<LinkedListNode>();

		LinkedListNode pointer = head;
		list.add(pointer);
		while(pointer.next != null) {
			list.add(pointer.next);
			pointer = pointer.next;
		}

		if (k == 0 || k == 1) return list.get(list.size()-1);
		return list.get(list.size() - k);
	}


	// --------------------------------- SOLUTION 2 --------------------------------- //
	/**
	 * printKthToLast - This method find the data of the kth to last element on a singly linked list using recursion
	 * @param head
	 * @param k
	 * @return the data of the kth to last element on a singly linked list 
	 */
	 public int printKthToLast(LinkedListNode head, int k) {
		if (head== null) {
			return 0;
		}
		int index = printKthToLast(head.next, k) + 1;
		if (index == k) {
			System.out.println(k + "th to last node is " + head.data);
		}
		return index;
	}

	// --------------------------------- SOLUTION 3 --------------------------------- //
	/**
	 * Wrapper class for the index value 
	 * @author gherrera
	 */
	class Index {
		int value = 0;
	}

	/**
	 * kthTolast - This method find kth to last element on a singly linked list using recursion and index
	 * @param head
	 * @param k
	 * @return the kth to last element on a singly linked list 
	 */
	public LinkedListNode kthTolast(LinkedListNode head, int k) {
		Exercise2.Index idx = new Exercise2().new Index();
		return kthToLast(head, k, idx);
	}

	/**
	 * kthToLast - This is the recursion method to find the kth to last element on a singly linked list using recursion and index
	 * @param head
	 * @param k
	 * @param idx
	 * @return the kth to last element on a singly linked list 
	 */
	private LinkedListNode kthToLast(LinkedListNode head, int k, Index idx) {
		if (head== null) {
			return null;
		}
		LinkedListNode node = kthToLast(head.next, k, idx);
		idx.value = idx.value + 1;
		if (idx.value == k) {
			return head;
		}
		return node;
	}

	// --------------------------------- SOLUTION 4 --------------------------------- //

	/**
	 * nthTolast - This method find kth to last element on a singly linked list using two pointers
	 * @explanation Let's assume that our list is composed by 7 elements ( 1, 2, 3, 4, 5, 6, 7). 
	 * 				If we want to retrieve the 2nth to last element that would be 6 we can
	 * 				user the two pointers approach. In that case we move pointer1 from 0 two elements up front.
	 * 				After that we increase pointer1 and pointer2 at the same time, with that when pointer1 reach
	 * 				the end of our list, pointer2 will be in the exactly position that we want.  
	 * @param head
	 * @param k
	 * @return the nth to last element on a singly linked list 
	 */
	public LinkedListNode nthTolast(LinkedListNode head, int n) {
		LinkedListNode pointerl = head;
		LinkedListNode pointer2 = head;
		
		/* Move pointerl n nodes into the list.*/
		for (int i= 0; i < n; i++) {
			if (pointerl == null) return null; // Out of bounds
			pointerl = pointerl.next;
		}

		/* Move them at the same pace. When pointerl hits the end, pointer2 will be at the right
		 * element. */
		while (pointerl!= null) {
			pointerl = pointerl.next;
			pointer2 = pointer2.next;
		}
		return pointer2;
	}
}
