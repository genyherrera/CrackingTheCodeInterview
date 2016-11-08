package com.genyherrera.crackingthecodeinterview.stacksandqueues;

import org.junit.Assert;
import org.junit.Test;

import com.genyherrera.crackingthecodeinterview.stacksandqueues.Exercise1.StackArray;

/**
 * @problem: Three in One: Describe how you could use a single array to implement three stacks.
 * @assumptions: 1. We'll that the interviewer let us decide the arrays size and stacks size.
 * 				 2. We'll assume that we can store the elements at any order that we prefer.
 * @author geny.herrera
 */
public class Exercise1Test {

	@Test
	public void testStackArraySame() throws Exception {
		Assert.assertEquals("C", createStackArray().peek(0));
		Assert.assertEquals("H", createStackArray().peek(1));
		Assert.assertEquals("L", createStackArray().peek(2));
	}
	
	@Test
	public void testStackArrayNotSame() throws Exception {
		Assert.assertNotEquals("I", createStackArray().peek(0));
		Assert.assertNotEquals("A", createStackArray().peek(1));
		Assert.assertNotEquals("D", createStackArray().peek(2));
	}

	private StackArray createStackArray() throws Exception {
		StackArray stackArray = new Exercise1().new StackArray(5);
		stackArray.push(0, "A");
		stackArray.push(0, "B");
		stackArray.push(0, "C");
		
		stackArray.push(1, "D");
		stackArray.push(1, "E");
		stackArray.push(1, "F");
		stackArray.push(1, "G");
		stackArray.push(1, "H");
		
		
		stackArray.push(2, "I");
		stackArray.push(2, "J");
		stackArray.push(2, "K");
		stackArray.push(2, "L");
		return stackArray;
	}
}
