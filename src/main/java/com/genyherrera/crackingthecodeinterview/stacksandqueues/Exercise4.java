package com.genyherrera.crackingthecodeinterview.stacksandqueues;

import java.util.Stack;

/**
 * @problem: Queue via Stacks: Implement a MyQueue class which implements a queue using two stacks.
 * @author geny.herrera
 */
public class Exercise4 {

	@SuppressWarnings({"rawtypes", "unchecked"})
	class MyQueue {

		
		private Stack data1;
		private Stack data2;

		public MyQueue() {
			data1 = new Stack();
			data2 = new Stack();
		}

		public void add(Object value) {
			data1.push(value);
		}

		public Object peek() {
			swapStacks();
			return data2.peek();
		}

		public Object poll() {
			swapStacks();
			return data2.pop();
		}

		private void swapStacks() {
			if (data2.isEmpty()) {
				while (!data1.isEmpty()) {
					data2.push(data1.pop());
				}
			}
		}

		public void remove() {
			swapStacks();
			data2.pop();
		}
	}


	public static void main(String[] args) {
		MyQueue myQueue = new Exercise4().new MyQueue();
		myQueue.add(1);
		myQueue.add(2);
		myQueue.add(3);
		myQueue.add(4);
		myQueue.add(5);
		System.out.println(myQueue.peek());
		System.out.println(myQueue.poll());
		myQueue.remove();
		myQueue.add(1);
		myQueue.add(2);
		myQueue.add(3);
		myQueue.add(4);
		myQueue.add(5);
		System.out.println(myQueue.peek());
		System.out.println(myQueue.poll());
		myQueue.remove();
	}

}
