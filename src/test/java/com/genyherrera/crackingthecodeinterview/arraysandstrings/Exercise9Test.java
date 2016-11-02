package com.genyherrera.crackingthecodeinterview.arraysandstrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for Exercise 9 on chapter Arrays And Strings.
 * 
 * String Rotation: Assume you have a method isSubstring which checks if one word is a substring
 * 					of another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one
 * 					call to isSubstring (e.g., "waterbottle" is a rotation of "erbottlewat").
 * @author geny.herrera
 */
public class Exercise9Test {
	
	@Test
	public void testIsRotationTrue() {
		Assert.assertTrue(new Exercise9().isRotation("waterbottle", "erbottlewat"));
		Assert.assertTrue(new Exercise9().isRotation("sodacup", "dacupso"));
	}
	
	@Test
	public void testIsRotationFalse() {
		Assert.assertFalse(new Exercise9().isRotation("waterbottle", "werbottleat"));
		Assert.assertFalse(new Exercise9().isRotation("sodacup", "dascupo"));
	}
}
