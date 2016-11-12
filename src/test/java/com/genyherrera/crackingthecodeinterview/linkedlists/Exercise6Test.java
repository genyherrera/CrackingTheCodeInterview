package com.genyherrera.crackingthecodeinterview.linkedlists;

import org.junit.Assert;
import org.junit.Test;

/**
 * @problem: Palindrome: Implement a function to check if a linked list is a palindrome.
 * @author geny.herrera
 */
public class Exercise6Test {

	@Test
	public void testIsPalindromeTrue() {
		LinkedListNode node = createLinkedList();
		Assert.assertTrue(new Exercise6().isPalindrome(node));
	}

	@Test
	public void testIsPalindromeFalse() {
		LinkedListNode node = createLinkedList();
		Assert.assertFalse(!new Exercise6().isPalindrome(node));
	}


	private LinkedListNode createLinkedList() {
		LinkedListNode head = new LinkedListNode(1);
		head.next = new LinkedListNode(2);
		head.next.next = new LinkedListNode(3);
		head.next.next.next = new LinkedListNode(4);
		head.next.next.next.next = new LinkedListNode(3);
		head.next.next.next.next.next = new LinkedListNode(2);
		head.next.next.next.next.next.next = new LinkedListNode(1);
		return head;
	}

}
