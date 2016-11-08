package com.genyherrera.crackingthecodeinterview.stacksandqueues;

import java.util.Stack;

/**
 * @problem: Stack Min: How would you design a stack which, in addition to push and pop, has a function min
 * 			 which returns the minimum element? Push, pop and min should all operate in 0(1) time.
 * @author geny.herrera
 */
public class Exercise2 {

	@SuppressWarnings("serial")
	class StackWithMin extends Stack<Integer> {

		// Define a list of integer to be the list of mins
		private Stack<Integer> mins;

		public StackWithMin() {
			mins = new Stack<Integer>();
		}

		public void push(int value){
			if (value <= min()) {
				// If the element is the new min, he is going to bo added to mins list
				mins.push(value);
			}
			super.push(value);
		}

		public Integer pop() {
			int value = super.pop();
			// If the element that is being retrive is the min we must also remove him from mins list
			// so the previous min will take over
			if (value == min()) {
				mins.pop();
			}
			return value;
		}

		public int min() {
			if (mins.isEmpty()) {
				return Integer.MAX_VALUE;
			} else {
				return mins.peek();
			}
		}
	}
}
