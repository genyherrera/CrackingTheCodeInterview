package com.genyherrera.crackingthecodeinterview.arraysandstrings;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for Exercise 7 on chapter Arrays And Strings.
 * 
 * @problem: Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
 *	         bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
 * @author geny.herrera
 */
public class Exercise7Test {
	
	@Test
	public void testRotateEquals() {
		Assert.assertArrayEquals(new char[][] {{'M','I','E','A'}, {'N','J','F','B'}, {'O','K','G','C'}, {'P','L','H','D'}},
		  new Exercise7().rotate(new char[][] {{'A','B','C','D'}, {'E','F','G','H'}, {'I','J','K','L'},{'M','N','O','P'}}));
		
		Assert.assertArrayEquals(new char[][] {{'5','Y','S','M','G','A'}, {'6','Z','T','N','H','B'}, {'7','1','U','O','I','C'}, {'8','2','V','P','J','D'}, {'9','3','W','Q','K','E'}, {'0','4','X','R','L','F'}}, 
		  new Exercise7().rotate(new char[][] {{'A','B','C','D','E','F'}, {'G','H','I','J','K','L'}, {'M','N','O','P','Q','R'}, {'S','T','U','V','W','X'}, {'Y','Z','1','2','3','4'}, {'5','6','7','8','9','0'}}));
	}
	
	@Test
	public void testRotateNotEquals() {
		Assert.assertNotEquals(Arrays.toString(new char[][] {{'A','B','C','D'}, {'E','F','G','H'}, {'I','J','K','L'},{'M','N','O','P'}}), 
        Arrays.toString(new Exercise7().rotate(new char[][] {{'A','B','C','D'}, {'E','F','G','H'}, {'I','J','K','L'},{'M','N','O','P'}})));

		Assert.assertNotEquals(Arrays.toString(new char[][] {{'A','B','C','D','E','F'}, {'G','H','I','J','K','L'}, {'M','N','O','P','Q','R'}, {'S','T','U','V','W','X'}, {'Y','Z','1','2','3','4'}, {'5','6','7','8','9','0'}}), 
		Arrays.toString(new Exercise7().rotate(new char[][] {{'A','B','C','D','E','F'}, {'G','H','I','J','K','L'}, {'M','N','O','P','Q','R'}, {'S','T','U','V','W','X'}, {'Y','Z','1','2','3','4'}, {'5','6','7','8','9','0'}})));
		}
}
