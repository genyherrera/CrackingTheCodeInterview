package com.genyherrera.crackingthecodeinterview.arraysandstrings;

import java.util.ArrayList;
import java.util.List;

/**
 * @problem: Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
 * 		     column are set to 0.
 * @author geny.herrera
 */
public class Exercise8 {

	/**
	 * setZerosMine - Method to set row and column to zero each time that found a 0 on matrix 
	 * @param matrix
	 */
	public int[][] setZerosMine(int[][] matrix) {
		List<Integer> rows = new ArrayList<Integer>();
		List<Integer> columns = new ArrayList<Integer>();

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[0].length; column++) {
				if (!rows.contains(row) && !columns.contains(column) && matrix[row][column] == 0) {
					rows.add(row);
					columns.add(column);
					nullifyLayer(matrix,row,column);
					break;
				}
			}
		}
		return matrix;
	}

	/**
	 * nullifyLayer - Method to nullify the row and column
	 * @param matrix
	 * @param rowToNullify
	 * @param columnToNullify
	 */
	private void nullifyLayer(int[][] matrix, int rowToNullify, int columnToNullify) {
		//Nullify Row
		for (int i = 0; i < matrix[0].length; i++) {
			matrix[rowToNullify][i] = 0;
		}

		//Nullify Column
		for (int j = 0; j < matrix.length; j++) {
			matrix[j][columnToNullify] = 0;
		}
	}

	// ------------------ BOOK SOLUTION --------------------------- //
	
	public int[][] setZeros(int[][] matrix) {
		boolean rowHasZero = false;
		boolean colHasZero = false;

		// Check if first row has a zero
		for (int j = 0; j < matrix[0].length; j++) {
			if (matrix[0][j] == 0) {
				rowHasZero = true;
				break;
			}
		}

		// Check if first column has a zero
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				colHasZero = true;
				break;
			}
		}

		// Check for zeros in the rest of the array
		for (int i= 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length;j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}

		// Nullify rows based on values in first column
		for (int i= 1; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				nullifyRow(matrix, i);
			}
		}

		// Nullify columns based on values in first row
		for (int j = 1; j < matrix[0].length; j++) {
			if (matrix[0][j] == 0) {
				nullifyColumn(matrix, j);
			}
		}

		// Nullify first row
		if (rowHasZero) {
			nullifyRow(matrix, 0);
		}
		// Nullify first column
		if (colHasZero) {
			nullifyColumn(matrix, 0);
		}
		
		return matrix;
	}

	private void nullifyRow(int[][] matrix, int row) {
		for (int j = 0; j < matrix[0].length; j++) {
			matrix[row][j] = 0;
		}
	}

	private void nullifyColumn(int[][] matrix, int col) {
		for (int i= 0; i < matrix.length; i++) {
			matrix[i][col] = 0;
		}
	}
}
