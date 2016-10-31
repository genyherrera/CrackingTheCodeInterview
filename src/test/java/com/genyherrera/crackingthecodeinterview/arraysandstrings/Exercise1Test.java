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
public class Exercise1Test {
	
	@Test
	public void testIsUniqueTrue() {
		Assert.assertTrue(new Exercise1().isUnique("abcdefghijklmnopqrstuvwyz"));
		Assert.assertTrue(new Exercise1().isUnique("aBcDeFgHiJkLmNoPqRsTuVwYz"));
		Assert.assertTrue(new Exercise1().isUnique("  abcde  fghijk  lmnopqrstuvwyz  "));
	}
	
	@Test
	public void testIsUniqueFalse() {
		Assert.assertFalse(new Exercise1().isUnique("abcdefghijklmnopqrstuvwyza"));
		Assert.assertFalse(new Exercise1().isUnique("abcdefghijklmnopqrstuvwyzA"));
		Assert.assertFalse(new Exercise1().isUnique("aBcDeFgHiJkLmNoPqRsTuVwYzAb"));
	}
}
