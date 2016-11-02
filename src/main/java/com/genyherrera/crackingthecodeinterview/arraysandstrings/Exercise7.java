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
	public static void rotate(char[][] matrix) {
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
				
				printMatrix(matrix);
			}
		}
	}
	
	public static void main(String[] args) {
		char[][] matrix = initializeMatrix();
		printMatrix(matrix);
		rotate(matrix);
	}
	
	public static void printMatrix(char[][] matrix){
        System.out.print("\n");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.print("\n");
        }
    }
	
	public static char[][] initializeMatrix(){
		char[][] matrix = {{'A','B','C','D','E','F'}, {'G','H','I','J','K','L'}, {'M','N','O','P','Q','R'}, {'S','T','U','V','W','X'}, {'Y','Z','1','2','3','4'}, {'5','6','7','8','9','0'}};
		return matrix;
    }
}
