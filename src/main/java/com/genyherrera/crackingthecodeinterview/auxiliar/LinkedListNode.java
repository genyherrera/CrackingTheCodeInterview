package com.genyherrera.crackingthecodeinterview.auxiliar;

public class LinkedListNode extends Object {
	
	public LinkedListNode next, prev, last;
	public Integer data;

	public LinkedListNode(int d, LinkedListNode n, LinkedListNode p){
		data = d;
		setNext(n);
		setPrevious(p);
	}
	public LinkedListNode(int d) {
		data = d;
	}

	public LinkedListNode() {}

	public void setNext(LinkedListNode n) {
		next = n;
		if (this == last) {
			last = n;
		}

		if (n != null && n.prev != this) {
			n.setPrevious(this);
		}
	}

	public void setPrevious(LinkedListNode p) {
		prev = p;
		if (p != null && p.next != this) {
			p.setNext(this);
		}
	}

	public LinkedListNode clone() {
		LinkedListNode next2 = null;
		if (next != null) {
			next2 = next.clone();
		}
		LinkedListNode head2 = new LinkedListNode(data, next2, null);
		return head2;
	}

	public boolean equals(LinkedListNode obj) {
		return data == obj.data.intValue();
	}

	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + data;
		hash = 31 * hash + (null == data ? 0 : data.hashCode());
		return hash;
	}
	
	public String toString(LinkedListNode head){
		StringBuilder builder = new StringBuilder();
		LinkedListNode node = head;
        while(node != null){
            builder.append("->" + node.data);
            node = node.next;
        }
        return builder.toString();
	}
	
	public String toString(){
		StringBuilder builder = new StringBuilder();
		LinkedListNode node = this;
        while(node != null){
            builder.append("->" + node.data);
            node = node.next;
        }
        return builder.toString();
	}
}
