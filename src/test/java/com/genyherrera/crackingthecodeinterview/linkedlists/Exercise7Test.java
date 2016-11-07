package com.genyherrera.crackingthecodeinterview.linkedlists;

import org.junit.Assert;
import org.junit.Test;

import com.genyherrera.crackingthecodeinterview.auxiliar.LinkedListNode;

/**
 * @problem: Intersection: Given two (singly) linked lists, determine if the two lists intersect. Return the
 * 			 intersecting node. Note that the intersection is defined based on reference, not value. That is, if the
 * 			 kth node of the first linked list is the exact same node (by reference) as the jth node of the second
 * 			 linked list, then they are intersecting.
 * @author geny.herrera
 */
public class Exercise7Test {

	@Test
	public void testFindIntersectionSame() {
		LinkedListNode headLinkedList1 = new LinkedListNode(3);
		LinkedListNode node1 = new LinkedListNode(1);
		LinkedListNode node2 = new LinkedListNode(5);
		LinkedListNode node3 = new LinkedListNode(6);
		LinkedListNode node4 = new LinkedListNode(7);
		LinkedListNode node5 = new LinkedListNode(2);
		LinkedListNode node6 = new LinkedListNode(1);
		
		headLinkedList1.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);
		node5.setNext(node6);
		
		LinkedListNode headLinkedList2 = new LinkedListNode(4);
		LinkedListNode node1LinkedList2 = new LinkedListNode(6);
		
		headLinkedList2.setNext(node1LinkedList2);
		node1LinkedList2.setNext(node4);
		
		Assert.assertSame(7, new Exercise7().findintersection(headLinkedList1, headLinkedList2).data);
	}

	@Test
	public void testFindIntersectionNotSame() {
		LinkedListNode headLinkedList1 = new LinkedListNode(3);
		LinkedListNode node1 = new LinkedListNode(1);
		LinkedListNode node2 = new LinkedListNode(5);
		LinkedListNode node3 = new LinkedListNode(6);
		LinkedListNode node4 = new LinkedListNode(7);
		LinkedListNode node5 = new LinkedListNode(2);
		LinkedListNode node6 = new LinkedListNode(1);
		
		headLinkedList1.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);
		node5.setNext(node6);
		
		LinkedListNode headLinkedList2 = new LinkedListNode(4);
		LinkedListNode node1LinkedList2 = new LinkedListNode(6);
		
		headLinkedList2.setNext(node1LinkedList2);
		node1LinkedList2.setNext(node4);
		
		Assert.assertNotSame(8, new Exercise7().findintersection(headLinkedList1, headLinkedList2).data);
	}
}
