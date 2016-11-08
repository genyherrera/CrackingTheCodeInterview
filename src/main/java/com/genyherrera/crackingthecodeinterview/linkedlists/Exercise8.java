package com.genyherrera.crackingthecodeinterview.linkedlists;

import java.util.ArrayList;
import java.util.List;

import com.genyherrera.crackingthecodeinterview.auxiliar.LinkedListNode;

/**
 * @problem: Loop Detection: Given a circular linked list, implement an algorithm that returns the node at the
 * 			 beginning of the loop.
 * 
 *           DEFINITION:
 * 				Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so
 * 				as to make a loop in the linked list.
 * 
 * 			EXAMPLE
 * 				Input: A - > B - > C - > D - > E - > C [the same C as earlier]
 * 				Output: C
 * @author geny.herrera
 */
public class Exercise8 {

	// --------------------------------- BOOK SOLUTION --------------------------------- //
	/**
	 * findLoopPoint - Method to find the loop point on a singly linkedlist
	 * @param head
	 * @return the loop node
	 */
	public LinkedListNode findLoopPoint(LinkedListNode head) {
		LinkedListNode slow = head;
		LinkedListNode fast = head;

		/* Find meeting point. This will be LOOP_SIZE - k steps into the linked list. */
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {//Collision
				break;
			}
		}

		/* Error check - no meeting point, and therefore no loop*/
		if (fast == null || fast.next == null) {
			return null;
		}

		/* Move slow to Head. Keep fast at Meeting Point. Each are k steps from the
		 * Loop Start. If they move at the same pace, they must meet at Loop Start . */
		slow = head;
		while (slow!= fast) {
			slow = slow.next;
			fast = fast.next;
		}

		/* Both now point to the start of the loop. */
		return fast;
	}

	// --------------------------------- MY SOLUTION --------------------------------- //
	/**
	 * findLoopPointMine - Method to find the loop point on a singly linkedlist
	 * @param head
	 * @return the loop node
	 */
	public LinkedListNode findLoopPointMine(LinkedListNode head) {
		List<LinkedListNode> list = new ArrayList<LinkedListNode>();

		// Add all elements to a list, if some element is referenced twice that element is the loop point
		while (head != null && head.next != null) {
			if (list.contains(head) == false) {
				list.add(head);
				head = head.next;
			} else {
				break;
			}
		}
		return head;
	}
}
