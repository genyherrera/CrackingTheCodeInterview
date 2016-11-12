package com.genyherrera.crackingthecodeinterview.linkedlists;

/**
 * @problem: Intersection: Given two (singly) linked lists, determine if the two lists intersect. Return the
 * 			 intersecting node. Note that the intersection is defined based on reference, not value. That is, if the
 * 			 kth node of the first linked list is the exact same node (by reference) as the jth node of the second
 * 			 linked list, then they are intersecting.
 * @author geny.herrera
 */
public class Exercise7 {
	
	/**
	 * Auxiliar class to store the tail node and the linkedlist size
	 * @author geny.herrera
	 */
	class TailAndSize {
		public LinkedListNode tail;
		public int size;
		
		public TailAndSize(LinkedListNode tail, int size) {
			this.tail = tail;
			this.size = size;
		}
	}
	
	/**
	 * findintersection - Method to find the intersection point between two singly linkedlist
	 * @param list1
	 * @param list2
	 * @return the intersection point
	 */
	public LinkedListNode findintersection(LinkedListNode list1, LinkedListNode list2) {
		TailAndSize resultList1 = getTailAndSize(list1);
		TailAndSize resultList2 = getTailAndSize(list2);
		
		// If different tail nodes, then there's no intersection.
		if (resultList1.tail != resultList2.tail) return null;
		
		// Get tail and sizes
		LinkedListNode longer = resultList1.size > resultList2.size ? list1 : list2;
		LinkedListNode shorter = resultList1.size < resultList2.size ? list1 : list2;
		
		// Point the longer at the same point to equalize length
		longer = getKthNode(longer, Math.abs(resultList1.size - resultList2.size));
		
		// Compare both until find the same reference
		while(longer != shorter) {
			longer = longer.next;
			shorter = shorter.next;
		}
		
		// Return either one
		return shorter;
	}

	/**
	 * getKthNode - Find the Kth element in a singly linkedlist
	 * @param longer
	 * @param k
	 * @return return the kth node
	 */
	private LinkedListNode getKthNode(LinkedListNode longer, int k) {
		while (k > 0) {
			longer = longer.next;
			k--;
		}
		return longer;
	}

	/**
	 * getTailAndSize - Method to return the tail node and the size of single linkedlist
	 * @param head
	 * @return
	 */
	private TailAndSize getTailAndSize(LinkedListNode head) {
		int count = 1;
		while (head.next != null) {
			count++;
			head = head.next;
		}
		
		return new Exercise7().new TailAndSize(head, count);
	}
}
