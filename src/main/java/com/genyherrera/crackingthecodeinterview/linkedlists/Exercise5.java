package com.genyherrera.crackingthecodeinterview.linkedlists;

import com.genyherrera.crackingthecodeinterview.auxiliar.LinkedListNode;

/**
 * @problem: Sum Lists: You have two numbers represented by a linked list, where each node contains a single
 * 			 digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
 * 			 function that adds the two numbers and returns the sum as a linked list.
 * 			 
 * 			 EXAMPLE
 * 				Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
 * 				Output: 2 -> 1 -> 9. That is, 912.
 * 
 * 			 FOLLOW UP
 *				Suppose the digits are stored in forward order. Repeat the above problem.
 * 				Input: (6 -> 1 -> 7) + (2 -> 9 -> 5).That is,617 + 295.
 * 				Output: 9 -> 1 -> 2. That is, 912.
 * @author geny.herrera
 *
 */
public class Exercise5 {

	// --------------------------------- SOLUTION 1 --------------------------------- //
	public LinkedListNode sumLinkedLists(LinkedListNode node1, LinkedListNode node2) {
		Integer numberNode1 = createNumber(node1);
		Integer numberNode2 = createNumber(node2);

		Integer result = numberNode1 + numberNode2;

		return createLinkedListNodeFromInteger(result);
	}

	private Integer createNumber(LinkedListNode node) {
		StringBuilder builder = new StringBuilder();

		LinkedListNode head = node;

		while(head != null) {
			builder.append(head.data);
			head = head.next;
		}

		return new Integer(builder.reverse().toString());
	}

	private LinkedListNode createLinkedListNodeFromInteger(Integer result) {
		String integerStringValue = result.toString();

		LinkedListNode root = new LinkedListNode(Integer.parseInt(String.valueOf(integerStringValue.charAt(integerStringValue.length()-1))));
		
		for (int i = integerStringValue.length() - 2; i >= 0 ; i--) {
			root = addLast(root, new LinkedListNode(Integer.parseInt(String.valueOf(integerStringValue.charAt(i)))));
		}
		
		return root;
	}

	private LinkedListNode addLast(LinkedListNode root, LinkedListNode node){
		if (root.next == null) {
			root.next = node;
		} else {
			addLast(root.next, node);
		}
		return root;
	}
	
	// --------------------------------- SOLUTION 2 --------------------------------- //
	
	public LinkedListNode sumLinkedListsFollowUp(LinkedListNode node1, LinkedListNode node2) {
		Integer numberNode1 = createNumberFollowUp(node1);
		Integer numberNode2 = createNumberFollowUp(node2);

		Integer result = numberNode1 + numberNode2;

		return createLinkedListNodeFromIntegerFollowUp(result);
	}

	private Integer createNumberFollowUp(LinkedListNode node) {
		StringBuilder builder = new StringBuilder();

		LinkedListNode head = node;

		while(head != null) {
			builder.append(head.data);
			head = head.next;
		}

		return new Integer(builder.toString());
	}

	private LinkedListNode createLinkedListNodeFromIntegerFollowUp(Integer result) {
		String integerStringValue = result.toString();

		LinkedListNode root = new LinkedListNode(Integer.parseInt(String.valueOf(integerStringValue.charAt(0))));
		
		for (int i = 1; i < integerStringValue.length() ; i++) {
			root = addLast(root, new LinkedListNode(Integer.parseInt(String.valueOf(integerStringValue.charAt(i)))));
		}
		
		return root;
	}
}
