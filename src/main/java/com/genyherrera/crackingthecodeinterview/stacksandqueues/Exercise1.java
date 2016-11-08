package com.genyherrera.crackingthecodeinterview.stacksandqueues;

/**
 * @problem: Three in One: Describe how you could use a single array to implement three stacks.
 * @assumptions: 1. We'll that the interviewer let us decide the arrays size and stacks size.
 * 				 2. We'll assume that we can store the elements at any order that we prefer.
 * @author geny.herrera
 */
public class Exercise1 {

	class StackArray {
		private int stackCapacity;
		private Object[] values; 
		private int[] sizes = new int[3]; 

		public StackArray(int stackSize) {
			values = new Object[stackSize * 3];
			this.stackCapacity = stackSize;
		}

		public void push(int stackNum, Object value) throws Exception {
			if (isFull(stackNum)) throw new Exception("This stack is already full, please select another");
			
			sizes[stackNum]++; //We increment here so the method lastNotNullPositionOfStack will return the last empty position 
			values[lastNotNullPositionOfStack(stackNum)] = value;
		}

		public Object pop(int stackNum) throws Exception {
			if (isEmpty(stackNum)) throw new Exception("This stack is empty");
			
			int topIndex = lastNotNullPositionOfStack(stackNum);
			Object value = values[topIndex]; // Get top
			values[topIndex] = 0; // Clear
			sizes[stackNum]--; // Shrink
			return value;
			
		}

		public Object peek(int stackNum) throws Exception {
			if (isEmpty(stackNum)) throw new Exception("This stack is empty");
			return values[lastNotNullPositionOfStack(stackNum)];
		}

		public boolean isEmpty(int stackNum) {
			return sizes[stackNum] == 0;
		}

		public boolean isFull(int stackNum) {
			return sizes[stackNum] == stackCapacity;
		}

		/* Returns the next available index */
		private int lastNotNullPositionOfStack(int stackNum) {
			int offset = stackNum * stackCapacity;
			int size = sizes[stackNum];
			return offset + size - 1;
		}
	}
}
