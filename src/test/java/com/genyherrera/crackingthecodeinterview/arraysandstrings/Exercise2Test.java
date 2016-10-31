package com.genyherrera.crackingthecodeinterview.arraysandstrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for Exercise 2 on chapter Arrays And Strings.
 * 
 * @problem: Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
 * @author geny.herrera
 */
public class Exercise2Test {
	
	@Test
	public void testIsPermutationTrue() {
		Assert.assertTrue(new Exercise2().isPermutation("bcdaaefghijklmnopqrstuvwyz","abcdefghijklmnopqrstuvwyza"));
		Assert.assertTrue(new Exercise2().isPermutation("b c daaefghijklmnopqrstuvwyz","abcdef ghijk lmnopqrstuvwyza"));
	}
	
	@Test
	public void testIsPermutationFalse() {
		Assert.assertFalse(new Exercise2().isPermutation("bcdaaefghijklmnopqrstuvwyza","abcdefghijklmnopqrstuvwyzab"));
		Assert.assertFalse(new Exercise2().isPermutation("b c daaefghijklmnopqrstuvwyz","abcdef ghijk lmnopqrs tuvwyza"));
	}
	
	@Test
	public void testIsPermutationOptimizedTrue() {
		Assert.assertTrue(new Exercise2().isPermutationOptimized("bcdaaefghijklmnopqrstuvwyz","abcdefghijklmnopqrstuvwyza"));
		Assert.assertTrue(new Exercise2().isPermutationOptimized("b c daaefghijklmnopqrstuvwyz","abcdef ghijk lmnopqrstuvwyza"));
	}
	
	@Test
	public void testIsPermutationOptimizedFalse() {
		Assert.assertFalse(new Exercise2().isPermutationOptimized("bcdaaefghijklmnopqrstuvwyza","abcdefghijklmnopqrstuvwyzab"));
		Assert.assertFalse(new Exercise2().isPermutationOptimized("b c daaefghijklmnopqrstuvwyz","abcdef ghijk lmnopqrs tuvwyza"));
	}
}
