package com.genyherrera.crackingthecodeinterview.arraysandstrings;

/**
 * @problem: Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
 *	         bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
 * @author geny.herrera
 */
public class Exercise7 {

	/**
	 * rotate - method to rotate a matrix
	 * @param matrix
	 * @return return the rotated matrix
	 */
	public char[][] rotate(char[][] matrix) {
		int n = matrix.length;
		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; i++) {
				int offset = i - first;
				int j = last - offset;
				char top = matrix[first][i]; // save top

				// left -> top
				matrix[first][i] = matrix[j][first];          

				// bottom -> left
				matrix[j][first] = matrix[last][j]; 

				// right -> bottom
				matrix[last][j] = matrix[i][last]; 

				// top -> right
				matrix[i][last] = top; // right <- saved top
			}
		}
		return matrix;
	}
}
