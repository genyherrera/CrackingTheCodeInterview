package com.genyherrera.crackingthecodeinterview.arraysandstrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for Exercise 4 on chapter Arrays And Strings.
 * 
 * @problem: Given a string, write a function to check if it is a permutation of
 *			 a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A
 *			 permutation is a rearrangement of letters. The palindrome does not need to be limited to just
 *			 dictionary words.
 * @author geny.herrera
 */
public class Exercise4Test {
	
	@Test
	public void testIsPermutationOfPalindromeTrue() {
		Assert.assertTrue(new Exercise4().isPermutationOfPalindrome("Tact &!@#%^&*() Coa"));
		Assert.assertTrue(new Exercise4().isPermutationOfPalindrome("Tact Coa"));
	}
	
	@Test
	public void testIsPermutationOfPalindromeFalse() {
		Assert.assertFalse(new Exercise4().isPermutationOfPalindrome("Tact b &!@#%^&*() Coa"));
		Assert.assertFalse(new Exercise4().isPermutationOfPalindrome("Tact b Coa"));
	}
}
