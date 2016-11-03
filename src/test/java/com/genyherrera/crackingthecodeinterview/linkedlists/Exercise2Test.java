package com.genyherrera.crackingthecodeinterview.linkedlists;

import org.junit.Assert;
import org.junit.Test;

import com.genyherrera.crackingthecodeinterview.auxiliar.LinkedListNode;

/**
 * @problem: Remove Dups: Write code to remove duplicates from an unsorted linked list.
 * 			 FOLLOW UP
 * 			 How would you solve this problem if a temporary buffer is not allowed?
 * @author geny.herrera
 */
public class Exercise2Test {

	@Test
	public void testKthToLastWithBuffer() {
		Assert.assertSame(5, new Exercise2().kthToLastWithBuffer(createLinkedList(), 3).data);
		Assert.assertSame(5, new Exercise2().kthTolast(createLinkedList(), 3).data);
		Assert.assertSame(5, new Exercise2().nthTolast(createLinkedList(), 3).data);
	}

	@Test
	public void testRemoveDuplicatesNotEquals() {
		Assert.assertNotSame(1, new Exercise2().kthToLastWithBuffer(createLinkedList(), 3).data);
		Assert.assertNotSame(3, new Exercise2().kthTolast(createLinkedList(), 3).data);
		Assert.assertNotSame(4, new Exercise2().nthTolast(createLinkedList(), 3).data);
	}

	private LinkedListNode createLinkedList() {
		LinkedListNode head = new LinkedListNode(1);
		head.next = new LinkedListNode(2);
		head.next.next = new LinkedListNode(3);
		head.next.next.next = new LinkedListNode(4);
		head.next.next.next.next = new LinkedListNode(5);
		head.next.next.next.next.next = new LinkedListNode(6);
		head.next.next.next.next.next.next = new LinkedListNode(7);
		return head;
	}
}
