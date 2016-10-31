package com.genyherrera.crackingthecodeinterview.arraysandstrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for Exercise 1 on chapter Arrays And Strings.
 * 
 * @problem: Is Unique: Implement an algorithm to determine if a string has all unique characters. 
 * 			  What if you cannot use additional data structures?
 * @author geny.herrera
 */
public class Exercise3Test {
	
	@Test
	public void testUrlifyStringEquals() {
		Assert.assertEquals("Mr%20John%20Smith", new Exercise3().urlifyString("Mr John Smith    ", 13));
		Assert.assertEquals("Geny%20Herrera", new Exercise3().urlifyString("Geny Herrera  ", 12));
	}
	
	@Test
	public void testUrlifyStringNotEquals() {
		Assert.assertNotEquals("Mr%20John%20Smith", new Exercise3().urlifyString("Mr John Smith    ", 12));
		Assert.assertNotEquals("Geny%20Herrera", new Exercise3().urlifyString("Geny Herrera  ", 11));
	}
	
	
	@Test
	public void testUrlifyStringOptimizedEquals() {
		Assert.assertEquals("Mr%20John%20Smith", new Exercise3().urlifyStringOptimized("Mr John Smith    ", 13));
		Assert.assertEquals("Geny%20Herrera", new Exercise3().urlifyStringOptimized("Geny Herrera  ", 12));
	}
	
	@Test
	public void testUrlifyStringOptimizedNotEquals() {
		Assert.assertNotEquals("Mr%20John%20Smith", new Exercise3().urlifyStringOptimized("Mr John Smith    ", 12));
		Assert.assertNotEquals("Geny%20Herrera", new Exercise3().urlifyStringOptimized("Geny Herrera  ", 11));
	}
}
