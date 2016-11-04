package com.genyherrera.crackingthecodeinterview.linkedlists;

import com.genyherrera.crackingthecodeinterview.auxiliar.LinkedListNode;

/**
 * @problem: Palindrome: Implement a function to check if a linked list is a palindrome.
 * @author geny.herrera
 */
public class Exercise6 {
	
	/**
	 * isPalindrome - Method to check if a linkedlist is a palindrome
	 * @param node1
	 * @return if the linkedlist is a palindrome
	 */
	public boolean isPalindrome(LinkedListNode node1) {
		LinkedListNode reversed = reverse(node1);
		return equals(node1, reversed);
	}

	/**
	 * equals - Method to verify if two linkedlist are equals
	 * @param node1
	 * @param reversed
	 * @return if two linkedlist are equals
	 */
	private boolean equals(LinkedListNode node1, LinkedListNode reversed) {
		while (node1 != null && reversed != null) {
			if (node1.data != reversed.data) return false;
			node1 = node1.next;
			reversed = reversed.next;
		}
		return true;
	}

	/**
	 * reverse - method to reverse a linkedlist
	 * @param node
	 * @return the linkedlist reversed
	 */
	private LinkedListNode reverse(LinkedListNode node) {
		LinkedListNode head = null;
		while(node != null) {
			LinkedListNode n = new LinkedListNode(node.data); // Copy node data
			n.next = head;
			head = n;
			node = node.next;
		}
		return head;
	}
}
