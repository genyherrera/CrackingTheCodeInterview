package com.genyherrera.crackingthecodeinterview.linkedlists;

import org.junit.Assert;
import org.junit.Test;

import com.genyherrera.crackingthecodeinterview.auxiliar.LinkedListNode;

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
public class Exercise5Test {

	@Test
	public void testSumLinkedListsEquals() {
		LinkedListNode node1 = createLinkedList(true);
		LinkedListNode node2 = createLinkedList(false);
		
		LinkedListNode result = new Exercise5().sumLinkedLists(node1, node2);
		Assert.assertEquals("->2->1->9", result.toString());
	}

	@Test
	public void testSumLinkedListsNotEquals() {
		LinkedListNode node1 = createLinkedList(true);
		LinkedListNode node2 = createLinkedList(false);
		
		LinkedListNode result = new Exercise5().sumLinkedLists(node1, node2);
		Assert.assertNotEquals("->9->1->2", result.toString());
	}


	@Test
	public void testSumLinkedListsFollowUpEquals() {
		LinkedListNode node1 = createLinkedListFollowUp(true);
		LinkedListNode node2 = createLinkedListFollowUp(false);
		
		LinkedListNode result = new Exercise5().sumLinkedListsFollowUp(node1, node2);
		Assert.assertEquals("->9->1->2", result.toString());
	}

	@Test
	public void testSumLinkedListsFollowUpNotEquals() {
		LinkedListNode node1 = createLinkedList(true);
		LinkedListNode node2 = createLinkedList(false);
		
		LinkedListNode result = new Exercise5().sumLinkedListsFollowUp(node1, node2);
		Assert.assertNotEquals("->2->1->9", result.toString());
	}

	private LinkedListNode createLinkedList(boolean isNode1) {
		LinkedListNode node = null;
		if (isNode1) {
			node = new LinkedListNode(7);
			node.next = new LinkedListNode(1);
			node.next.next = new LinkedListNode(6);	
		} else {
			node = new LinkedListNode(5);
			node.next = new LinkedListNode(9);
			node.next.next = new LinkedListNode(2);
		}
		return node;
	}

	private LinkedListNode createLinkedListFollowUp(boolean isNode1) {
		LinkedListNode node = null;
		if (isNode1) {
			node = new LinkedListNode(6);
			node.next = new LinkedListNode(1);
			node.next.next = new LinkedListNode(7);	
		} else {
			node = new LinkedListNode(2);
			node.next = new LinkedListNode(9);
			node.next.next = new LinkedListNode(5);
		}
		return node;
	}

}
