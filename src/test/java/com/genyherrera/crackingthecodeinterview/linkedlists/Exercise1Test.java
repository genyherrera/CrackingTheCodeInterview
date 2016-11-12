package com.genyherrera.crackingthecodeinterview.linkedlists;

import org.junit.Assert;
import org.junit.Test;

/**
 * @problem: Remove Dups: Write code to remove duplicates from an unsorted linked list.
 * 			 FOLLOW UP
 * 			 How would you solve this problem if a temporary buffer is not allowed?
 * @author geny.herrera
 */
public class Exercise1Test {

	@Test
	public void testRemoveDuplicatesEquals() {
		Assert.assertEquals("[1, 2, 3, 4, 5]", new Exercise1().removeDuplicatesWithBuffer(createLinkedList()).toString());
		Assert.assertEquals("->1->2->3->4->5", new Exercise1().removeDuplicatesWithoutBuffer(createLinkedList()).toString());
	}

	@Test
	public void testRemoveDuplicatesNotEquals() {
		Assert.assertNotEquals("[1, 2, 3, 4, 5, 2, 3]", new Exercise1().removeDuplicatesWithBuffer(createLinkedList()).toString());
		Assert.assertNotEquals("->1->2->3->4->5-2>->3", new Exercise1().removeDuplicatesWithoutBuffer(createLinkedList()).toString());
	}

	private LinkedListNode createLinkedList() {
		LinkedListNode head = new LinkedListNode(1);
		head.next = new LinkedListNode(2);
		head.next.next = new LinkedListNode(3);
		head.next.next.next = new LinkedListNode(4);
		head.next.next.next.next = new LinkedListNode(5);
		head.next.next.next.next.next = new LinkedListNode(2);
		head.next.next.next.next.next.next = new LinkedListNode(3);
		return head;
	}
}
