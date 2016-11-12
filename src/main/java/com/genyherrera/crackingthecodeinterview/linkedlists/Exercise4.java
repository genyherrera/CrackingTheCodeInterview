package com.genyherrera.crackingthecodeinterview.linkedlists;

/**
 * @problem: Partition: Write code to partition a linked list around a value x, such that all nodes less than x come
 * 			 before all nodes greater than or equal to x. If x is contained within the list the values of x only need
 * 			 to be after the elements less than x (see below). The partition element x can appear anywhere in the
 * 			 "right partition"; it does not need to appear between the left and right partitions.
 * 
 * 			 EXAMPLE
 * 				Input:  3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition= 5]
 * 				Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
 * @author geny.herrera
 *
 */
public class Exercise4 {

	// --------------------------------- SOLUTION 1 --------------------------------- //
	/**
	 * partition - Method to reorganize the linkedlist
	 * @param node
	 * @param x
	 * @return the linkedlist reorganized
	 */
	public LinkedListNode partition(LinkedListNode node, int x) {
		LinkedListNode head =  node;
		LinkedListNode tail = node;

		while (node != null) {
			LinkedListNode next = node.next;
			if (node.data < x) {
				/* Insert node at head. */
				node.next= head;
				head= node;
			} else {
				/* Insert node at tail. */
				tail.next= node;
				tail= node;
			}
			node= next;
		}
		tail.next= null;

		//The head has changed, so we need to return it to the user.
		return head;
	}

	// --------------------------------- SOLUTION 1 --------------------------------- //
		/**
		 * partition2 - Method to reorganize the linkedlist
		 * @param node
		 * @param x
		 * @return the linkedlist reorganized
		 */
	public LinkedListNode partition2(LinkedListNode node, int x) {
		LinkedListNode beforeStart = null;
		LinkedListNode beforeEnd = null;
		LinkedListNode afterStart = null;
		LinkedListNode afterEnd = null;

		/*Partition list*/
		while (node !=  null) {
			LinkedListNode next = node.next;
			node.next = null;
			if (node.data< x) {
				/* Insert node into end of before list*/
				if (beforeStart == null) {
					beforeStart = node;
					beforeEnd = beforeStart;
				} else {
					beforeEnd.next = node;
					beforeEnd = node;
				}
			} else {

				/* Insert node into end of after list*/
				if (afterStart == null) {
					afterStart = node;
					afterEnd = afterStart;
				} else {
					afterEnd.next = node;
					afterEnd = node;
				}
			}
			node  = next;
		}
		if (beforeStart == null) {
			return afterStart;
		}

		/* Merge before list and after list */
		beforeEnd.next = afterStart;
		return beforeStart;
	}
}
