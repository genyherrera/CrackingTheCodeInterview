package com.genyherrera.crackingthecodeinterview.interviewquestions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	/* public static boolean[][] visited;

    public static int getBiggestRegion(int[][] matrix) {
        int count = 0;
        for (int i = 0; i <= matrix.length; i++) {
            for (int j = 0; j <= matrix[0].length; j++) {
                if(!visited[i][j]) max = Math.max(max, findZoneHelper(grid, i, j, 0, matrix.length, matrix[0].length));
            }
        }
    }

    public static int findZoneHelper(int[][] grid, int i, int j, int count, int M, int N) {
        if(i < 0 || j < 0 || i >= M || j >= N) return 0;
        if(visited[i][j]) return 0;
        visited[i][j] = true;
        if(grid[i][j] == 0) return 0;
        else return 1 +
            findZoneHelper(grid, i-1, j-1, count, M, N) +
            findZoneHelper(grid, i-1, j, count, M, N) + 
            findZoneHelper(grid, i-1, j+1, count, M, N) + 
            findZoneHelper(grid, i, j-1, count, M, N) + 
            findZoneHelper(grid, i, j, count, M, N) + 
            findZoneHelper(grid, i, j+1, count, M, N) + 
            findZoneHelper(grid, i+1, j-1, count, M, N) + 
            findZoneHelper(grid, i+1, j, count, M, N) + 
            findZoneHelper(grid, i+1, j+1, count, M, N);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(getBiggestRegion(grid));
    }*/

	public static void main(String[] args) {
		System.out.println(isPrime(33));
	}
	static boolean isPrime(int n) {
		for (int x = 2; x <= Math.sqrt(n); x++) {
			if (n % x == 0) {
				return false;
			}
		}
		return true;
	}

}