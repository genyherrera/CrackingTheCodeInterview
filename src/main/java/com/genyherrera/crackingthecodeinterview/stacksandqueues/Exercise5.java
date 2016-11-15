package com.genyherrera.crackingthecodeinterview.stacksandqueues;

import java.util.Stack;

import com.genyherrera.crackingthecodeinterview.stacksandqueues.Exercise5.OrderedStack;

/**
 * @problem: Sort Stack: Write a program to sort a stack such that the smallest items are on the top. You can use
 * 			 an additional temporary stack, but you may not copy the elements into any other data structure
 * 			 (such as an array). The stack supports the following operations: push, pop, peek, and is Empty.
 * @author geny.herrera
 */
public class Exercise5 {

	@SuppressWarnings({"rawtypes", "unchecked"})
	class OrderedStack<Integer> extends Stack<Integer> {

		public Integer push(Integer value) {
			super.push(value);
			sortStack(this);
			return value;
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
			OrderedStack<Integer> aux = new OrderedStack<Integer>();
			while(!stack.isEmpty()) {
				/* Insert each element in s in sorted order into r. */
				Integer tmp = (Integer) stack.pop();
				while(!aux.isEmpty() && (int) peek() > (int) tmp) {
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
		OrderedStack<Integer> myStack = new Exercise5().new  OrderedStack<Integer>();
		myStack.push(5);
		myStack.push(6);
		myStack.push(3);
		myStack.push(1);
		myStack.push(2);
		
		System.out.println(myStack.pop());
		System.out.println(myStack.peek());
		
	}
}
