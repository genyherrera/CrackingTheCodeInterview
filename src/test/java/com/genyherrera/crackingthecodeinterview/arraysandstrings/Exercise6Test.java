package com.genyherrera.crackingthecodeinterview.arraysandstrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for Exercise 6 on chapter Arrays And Strings.
 * 
 * @problem: String Compression: Implement a method to perform basic string compression using the counts
 *			 of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
 * 			 "compressed" string would not become smaller than the original string, your method should return
 * 			 the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 * @author geny.herrera
 */
public class Exercise6Test {
	
	@Test
	public void testCompressionEquals() {
		Assert.assertEquals("a2b1c5a3",new Exercise6().compression("aabcccccaaa"));
		Assert.assertEquals("aabccdeeaa",new Exercise6().compression("aabccdeeaa"));
	}
	
	@Test
	public void testCompressionNotEquals() {
		Assert.assertNotEquals("aabcccccaaa",new Exercise6().compression("aabcccccaaa"));
		Assert.assertNotEquals("a2b1c2d1e2a2",new Exercise6().compression("aabccdeeaa"));
	}
}
