package com.genyherrera.crackingthecodeinterview.stacksandqueues;

import org.junit.Assert;
import org.junit.Test;

import com.genyherrera.crackingthecodeinterview.stacksandqueues.Exercise2.StackWithMin;

/**
 * @problem: Stack Min: How would you design a stack which, in addition to push and pop, has a function min
 * 			 which returns the minimum element? Push, pop and min should all operate in 0(1) time.
 * @author geny.herrera
 */
public class Exercise2Test {

	@Test
	public void testStackWithMinSame() throws Exception {
		Assert.assertEquals(3, createStack().min());
	}
	
	@Test
	public void testStackWithMinNotSame() throws Exception {
		Assert.assertNotEquals(5, createStack().min());
	}

	private StackWithMin createStack() throws Exception {
		StackWithMin myStack = new Exercise2().new StackWithMin();
		myStack.push(5);
		myStack.push(6);
		myStack.push(3);
		myStack.push(7);
		return myStack;
	}
}
