package com.genyherrera.crackingthecodeinterview.linkedlists;

import org.junit.Assert;
import org.junit.Test;

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
public class Exercise8Test {

	@Test
	public void testFindLoopPointSame() {
		LinkedListNode linkedListLooped = createLinkedListLooped();
		Assert.assertSame(4, new Exercise8().findLoopPoint(linkedListLooped).data);
		Assert.assertSame(4, new Exercise8().findLoopPointMine(linkedListLooped).data);
	}

	@Test
	public void testFindLoopPointNotSame() {
		LinkedListNode linkedListLooped = createLinkedListLooped();
		Assert.assertNotSame(5, new Exercise8().findLoopPoint(linkedListLooped).data);
		Assert.assertNotSame(5, new Exercise8().findLoopPointMine(linkedListLooped).data);
	}
	
	private LinkedListNode createLinkedListLooped() {
		LinkedListNode head = new LinkedListNode(1);
		LinkedListNode node2 = new LinkedListNode(2);
		LinkedListNode node3 = new LinkedListNode(3);
		LinkedListNode node4 = new LinkedListNode(4);
		LinkedListNode node5 = new LinkedListNode(5);
		LinkedListNode node6 = new LinkedListNode(6);
		LinkedListNode node7 = new LinkedListNode(7);
		LinkedListNode node8 = new LinkedListNode(8);
		LinkedListNode node9 = new LinkedListNode(9);

		head.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);
		node5.setNext(node6);
		node6.setNext(node7);
		node7.setNext(node8);
		node8.setNext(node9);
		node9.setNext(node4);
		
		return head;
	}
}
