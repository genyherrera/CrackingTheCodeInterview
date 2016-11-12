package com.genyherrera.crackingthecodeinterview.linkedlists;

/**
 * @problem: Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but
 * 			 the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
 * 			 that node.
 * 			 
 * 			 EXAMPLE
 * 			 Input:the node c from the linked list a->b->c->d->e->f
 * 			 Result: nothing is returned, but the new linked list looks like a ->b->d- >e- >f
 * @author geny.herrera
 *
 */
public class Exercise3 {


	/**
	 * deleteNode - Method to delete a specific node with only access to that node.
	 * @param node
	 * @return if could delete or not
	 */
	public boolean deleteNode(LinkedListNode node) {
		if (node == null || node.next == null) {
			return false; // Failure
		}
		node.data = node.next.data;
		node.next = node.next.next;
		return true;
	}
}
