package com.genyherrera.crackingthecodeinterview.stacksandqueues;

import java.util.Stack;

/**
 * @problem: Sort Stack: Write a program to sort a stack such that the smallest items are on the top. You can use
 * 			 an additional temporary stack, but you may not copy the elements into any other data structure
 * 			 (such as an array). The stack supports the following operations: push, pop, peek, and is Empty.
 * @author geny.herrera
 */
public class Exercise5 {

	@SuppressWarnings({"rawtypes", "unchecked"})
	class OrderedStack<Integer> extends Stack<Integer> {

		public OrderedStack() {
		}

		public Integer push(Integer value) {
			return super.push(value);
		}

		public Integer peek() {
			sortStack(this);
			return super.peek();
		}

		public Integer pop() {
			sortStack(this);
			return super.pop();
		}

		public boolean isEmpty() {
			return super.isEmpty();
		}

		private void sortStack(OrderedStack stack) {
			Stack<Integer> aux = new Stack<Integer>();
			while(!stack.isEmpty()) {
				/* Insert each element in s in sorted order into r. */
				Integer tmp = (Integer) stack.pop();
				while(!aux.isEmpty() && aux.peek() > tmp) {
					stack.push(aux.pop());
				}
				aux.push(tmp);
			}

			/* Copy the elements from r back into s. */
			while (!aux.isEmpty()) {
				stack.push(aux.pop());
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new Integer(5) > new Integer(10));
	}
}
