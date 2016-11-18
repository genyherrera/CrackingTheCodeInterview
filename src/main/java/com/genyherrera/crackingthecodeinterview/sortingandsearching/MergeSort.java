package com.genyherrera.crackingthecodeinterview.sortingandsearching;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] myArray = new int[]{8,6,2,7,1,3,4,9,5};
		mergeSort(myArray);
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i]);
		}
	}

	// ---------------------------------- BOOK SOLUTION ----------------------------------// 
	private static void mergeSort(int[] myArray) {
		int[] helper = new int[myArray.length];
		mergeSort(myArray, helper, 0, myArray.length - 1);
	}

	private static void mergeSort(int[] myArray, int[] helper, int start, int end) {
		if (start < end) {
			int middle = (start + end) / 2;
			mergeSort(myArray, helper, start, middle);
			mergeSort(myArray, helper, middle + 1, end);
			merge(myArray, helper, start, middle, end);
		}
	}

	private static void merge(int[] myArray, int[] helper, int start, int middle, int end) {
		/* Copy both halves into a helper array*/
		for (int i = start; i <= end; i++) {
			helper[i] = myArray[i];
		}

		int helperStart = start;
		int helperEnd = middle + 1;
		int current = start;

		/* Iterate through helper array. Compare the left and right half, copying back
		 * the smaller element from the two halves into the original array. */
		while (helperStart <= middle && helperEnd <= end) {
			if (helper[helperStart] <= helper[helperEnd]) {
				myArray[current] = helper[helperStart];
				helperStart++;
			} else {//If right element is smaller than left element
				myArray[current] = helper[helperEnd];
				helperEnd++;
			}
			current++;
		}

		/* Copy the rest of the left side of the array into the target array*/
		int remaining = middle - helperStart;
		for (int i= 0; i <= remaining; i++) {
			myArray[current + i] = helper[helperStart + i];
		}
	}
	
	// ---------------------------------- REDABLE SOLUTION ----------------------------------//
	public static void mergeSort2(int[] inputArray) {
        if (inputArray.length < 2) return;
        
        int mid = inputArray.length / 2;
        
        int[] left = Arrays.copyOfRange(inputArray, 0, mid);
        int[] right = Arrays.copyOfRange(inputArray, mid, inputArray.length);
        
        mergeSort2(left);
        mergeSort2(right);
        merge2(left, right, inputArray);
    }
	
	public static void merge2(int[] left, int[] right, int[] arr) {
    	System.out.println("LEFT: " + Arrays.toString(left));
        System.out.println("RIGHT: " + Arrays.toString(right));
        int leftSize = left.length;
        int rightSize = right.length;
        
        int i = 0, j = 0, k = 0;
        
       while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < leftSize) {
            arr[k++] = left[i++];
        }
        while (j < rightSize) {
            arr[k++] = right[j++];
        }
    }

}
