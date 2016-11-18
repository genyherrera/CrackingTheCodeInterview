package com.genyherrera.crackingthecodeinterview.sortingandsearching;

import java.util.Arrays;

public class MyMergeSort {

	public static void main(String[] args) throws Exception {
		int[] array = new int[]{8,6,2,7,1,3,4,9,5,8,3};
		mergeSort(array);
		System.out.println("RESULT = " + Arrays.toString(array));
	}

	public static void mergeSort(int[] inputArray) {
		if (inputArray.length < 2) return;
		
		int middleIndex = inputArray.length / 2;
		int[] leftSide = Arrays.copyOfRange(inputArray, 0, middleIndex);
		int[] rigthSide = Arrays.copyOfRange(inputArray, middleIndex, inputArray.length);
		mergeSort(leftSide);
		mergeSort(rigthSide);
		merge(leftSide, rigthSide, inputArray);
    }

    public static void merge(int[] left, int[] right, int[] arr) {
    	 int i = 0, j = 0, k = 0;
    	 
    	 while(i < left.length && j < right.length) {
    		 if (left[i] > right[j]) {
    			 arr[k] = right[j];
    			 j++;
    		 } else {
    			 arr[k] = left[i];
    			 i++;
    		 }
    		 k++;
    	 }
    	 while(i < left.length) {
    		 arr[k] = left[i];
    		 k++;
    		 i++;
    	 }
    	 while(j < right.length) {
    		 arr[k] = right[j];
    		 k++;
    		 j++;
    	 }
    }
	
}
	
