package com.genyherrera.crackingthecodeinterview.arraysandstrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for Exercise 5 on chapter Arrays And Strings.
 * 
 * @problem: One Away: There are three types of edits that can be performed on strings: insert a character,
 * 			 remove a character, or replace a character. Given two strings, write a function to check if they are
 * 			 one edit (or zero edits) away.
 * 
 * 			 EXAMPLE:
 * 			 pale, ple -> true
 *  		 pales, pale -> true
 *			 pale, bale -> true
 * 			 pale, bae -> false
 * @author geny.herrera
 */
public class Exercise5Test {
	
	@Test
	public void testIsOneActionAwayTrue() {
		Assert.assertTrue(new Exercise5().isOneActionAway("pale", "ple"));
		Assert.assertTrue(new Exercise5().isOneActionAway("pales", "pale"));
	}
	
	@Test
	public void testIsOneActionAwayFalse() {
		Assert.assertFalse(new Exercise5().isOneActionAway("pale", "bales"));
		Assert.assertFalse(new Exercise5().isOneActionAway("pale", "bae"));
	}
}
