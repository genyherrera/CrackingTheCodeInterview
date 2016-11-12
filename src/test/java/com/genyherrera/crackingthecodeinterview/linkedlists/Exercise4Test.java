package com.genyherrera.crackingthecodeinterview.linkedlists;

import org.junit.Assert;
import org.junit.Test;

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
 */
public class Exercise4Test {

	@Test
	public void testPartitionEquals() {
		LinkedListNode head = createLinkedList();
		head = new Exercise4().partition(head, 5);
		Assert.assertEquals("->1->2->3->5->8->5->10", head.toString());
	}

	@Test
	public void testPartitionNotEquals() {
		LinkedListNode head = createLinkedList();
		new Exercise4().partition(head, 5);
		Assert.assertNotEquals("->1->2->3->5->8->5->10", head.toString());
	}
	
	@Test
	public void testPartition2Equals() {
		LinkedListNode head = createLinkedList();
		head = new Exercise4().partition2(head, 5);
		Assert.assertEquals("->3->2->1->5->8->5->10", head.toString());
	}

	@Test
	public void testPartition2NotEquals() {
		LinkedListNode head = createLinkedList();
		new Exercise4().partition2(head, 5);
		Assert.assertNotEquals("->1->2->3->5->8->5->10", head.toString());
	}

	private LinkedListNode createLinkedList() {
		LinkedListNode head = new LinkedListNode(3);
		head.next = new LinkedListNode(5);
		head.next.next = new LinkedListNode(8);
		head.next.next.next = new LinkedListNode(5);
		head.next.next.next.next = new LinkedListNode(10);
		head.next.next.next.next.next = new LinkedListNode(2);
		head.next.next.next.next.next.next = new LinkedListNode(1);
		
		return head;
	}
}
