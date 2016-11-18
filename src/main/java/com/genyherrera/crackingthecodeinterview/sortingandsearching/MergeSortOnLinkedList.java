package com.genyherrera.crackingthecodeinterview.sortingandsearching;

public class MergeSortOnLinkedList {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
		
		public String toString(ListNode head){
			StringBuilder builder = new StringBuilder();
			ListNode node = head;
	        while(node != null){
	            builder.append("->" + node.val);
	            node = node.next;
	        }
	        return builder.toString();
		}
	}

	public static ListNode sortList(ListNode head) {
		return mergeSort(head);
	}

	public static ListNode mergeSort(ListNode headOriginal) { 
		if (headOriginal == null || headOriginal.next == null) 
			return headOriginal;

		ListNode a = headOriginal;
		ListNode b = headOriginal.next; 

		while ((b != null) && (b.next != null)) { 
			headOriginal = headOriginal.next; 
			b = (b.next).next; 
		} 

		b = headOriginal.next; 
		headOriginal.next = null; 

		return merge(mergeSort(a), mergeSort(b));
	}    

	public static ListNode merge(ListNode a, ListNode b) { 
		ListNode temp = new MergeSortOnLinkedList().new ListNode(0); 
		ListNode head = temp;
		ListNode c = head; 

		while ((a != null) && (b != null)) {
			if (a.val <= b.val) { 
				c.next = a; 
				c = a; 
				a = a.next; 
			} else { 
				c.next = b; 
				c = b; 
				b = b.next;
			} 
		}

		c.next = (a == null) ? b : a; 
		return head.next; 
	} 
	
	public static void main(String[] args) {
		ListNode head = new MergeSortOnLinkedList().new ListNode(1);
		head.next = new MergeSortOnLinkedList().new ListNode(2);
		head.next.next = new MergeSortOnLinkedList().new ListNode(3);
		head.next.next.next = new MergeSortOnLinkedList().new ListNode(4);
		head.next.next.next.next = new MergeSortOnLinkedList().new ListNode(5);
		head.next.next.next.next.next = new MergeSortOnLinkedList().new ListNode(2);
		head.next.next.next.next.next.next = new MergeSortOnLinkedList().new ListNode(3);
		System.out.println(head.toString(head));
		head = sortList(head);
		System.out.println(head.toString(head));
	}
	
	/*public static ListNode merge2(ListNode l, ListNode r) {
		ListNode p1 = l;
		ListNode p2 = r;
 
		ListNode fakeHead = new ListNode(100);
		ListNode pNew = fakeHead;
 
		while (p1 != null || p2 != null) {
 
			if (p1 == null) {
				pNew.next = new ListNode(p2.val);
				p2 = p2.next;
				pNew = pNew.next;
			} else if (p2 == null) {
				pNew.next = new ListNode(p1.val);
				p1 = p1.next;
				pNew = pNew.next;
			} else {
				if (p1.val < p2.val) {
					// if(fakeHead)
					pNew.next = new ListNode(p1.val);
					p1 = p1.next;
					pNew = pNew.next;
				} else if (p1.val == p2.val) {
					pNew.next = new ListNode(p1.val);
					pNew.next.next = new ListNode(p1.val);
					pNew = pNew.next.next;
					p1 = p1.next;
					p2 = p2.next;
 
				} else {
					pNew.next = new ListNode(p2.val);
					p2 = p2.next;
					pNew = pNew.next;
				}
			}
		}
 
		// printList(fakeHead.next);
		return fakeHead.next;
	}*/
}
