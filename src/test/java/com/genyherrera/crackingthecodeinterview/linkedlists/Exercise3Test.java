package com.genyherrera.crackingthecodeinterview.linkedlists;

import org.junit.Assert;
import org.junit.Test;

import com.genyherrera.crackingthecodeinterview.auxiliar.LinkedListNode;

/**
 * @problem: Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but
 * 			 the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
 * 			 that node.
 * 			 
 * 			 EXAMPLE
 * 			 Input:the node c from the linked list a->b->c->d->e->f
 * 			 Result: nothing is returned, but the new linked list looks like a ->b->d- >e- >f
 * @author geny.herrera
 */
public class Exercise3Test {

	@Test
	public void testDeleteNodeEquals() {
		LinkedListNode head = createLinkedList();
		new Exercise3().deleteNode(head.next.next.next);
		Assert.assertEquals("->1->2->3->5->6->7", head.toString());
	}

	@Test
	public void testDeleteNodeNotEquals() {
		LinkedListNode head = createLinkedList();
		new Exercise3().deleteNode(head.next.next.next);
		Assert.assertNotEquals("->1->2->3->4->5->6->7", head.toString());
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
