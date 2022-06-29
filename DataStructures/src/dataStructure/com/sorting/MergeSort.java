package dataStructure.com.sorting;

import java.util.Random;

public class MergeSort {
	/*
	 * Insertion Sort: Compare two numbers , should be index[1] in temp variable; if
	 * its bigger value then swap it;
	 */

	public static void main(String[] args) {
//		Random rand = new Random();
//		int[] array = new int[10];
		 int[] array = { 4, 1, 8, 7, 6, 3, 2, 9};
//		for (int i = 0; i < array.length; i++) {
//			array[i] = rand.nextInt(100);
//		}

		System.out.println("Before Sort:");
		printArray(array);

		mergeSort(array);

		System.out.println("After Sort:");
		printArray(array);

	}

	private static void mergeSort(int[] A) {
		
		if(A.length<2) return;
		int mid=A.length/2;
		int[] left=new int[mid];
		int[] right=new int[A.length-mid];
		
		for (int i = 0; i < mid; i++) {
			left[i] = A[i];
		}
		for (int j = mid; j < A.length; j++) {
			right[j - mid] = A[j];
		}
		
		mergeSort(left);
		mergeSort(right);
		
		merge(A,left,right);
		
	}

	private static void merge(int[] A, int[] left, int[] right) {
		
		int leftSize= left.length;
		int rightSize=right.length;
		
		int i=0,j=0,k=0;
		while (i < leftSize && j < rightSize) {
			if (left[i] <= right[j]) {
				A[k] = left[i];
				i++;
			} else {
				A[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i<leftSize) {
			A[k]=left[i];
			i++;k++;
		}	
		
		while(j<rightSize) {
			A[k]=right[j];
			j++;k++;
		}	
		
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
