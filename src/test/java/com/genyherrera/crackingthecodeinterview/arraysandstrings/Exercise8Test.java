package com.genyherrera.crackingthecodeinterview.arraysandstrings;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for Exercise 8 on chapter Arrays And Strings.
 * 
 * @problem: Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
 * 		     column are set to 0.
 * @author geny.herrera
 */
public class Exercise8Test {
	
	@Test
	public void testSetZerosEqualsEquals() {
		Assert.assertArrayEquals(new int[][] {{0,0,0,0},{0,0,0,0},{0,0,1,0},{0,0,0,0},{0,0,1,0}},
        new Exercise8().setZeros(new int[][] {{1,0,1,1},{1,1,1,0},{1,1,1,1},{0,1,1,1},{1,1,1,1}}));
		
		Assert.assertArrayEquals(new int[][] {{0,0,0,0},{0,0,0,0},{0,0,1,0},{0,0,0,0},{0,0,1,0}},
    new Exercise8().setZerosMine(new int[][] {{1,0,1,1},{1,1,1,0},{1,1,1,1},{0,1,1,1},{1,1,1,1}}));
				
	}
	
	@Test
	public void testSetZerosEqualsNotEquals() {
		Assert.assertNotEquals((Arrays.toString(new int[][] {{1,0,1,1},{1,1,1,0},{1,1,1,1},{0,1,1,1},{1,1,1,1}})),
	   Arrays.toString(new Exercise8().setZeros(new int[][] {{1,0,1,1},{1,1,1,0},{1,1,1,1},{0,1,1,1},{1,1,1,1}})));
				
		Assert.assertNotEquals((Arrays.toString(new int[][] {{1,0,1,1},{1,1,1,0},{1,1,1,1},{0,1,1,1},{1,1,1,1}})),
   Arrays.toString(new Exercise8().setZerosMine(new int[][] {{1,0,1,1},{1,1,1,0},{1,1,1,1},{0,1,1,1},{1,1,1,1}})));
	}
}
