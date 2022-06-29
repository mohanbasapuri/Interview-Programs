package dataStructure.com.sorting;

import java.util.Random;

public class InsertionSort {
	/*
	 * Insertion Sort: Compare two numbers , should be index[1] in temp variable; if
	 * its bigger value then swap it;
	 */

	public static void main(String[] args) {
		Random rand = new Random();
		int[] array = new int[100];
		// int[] array = { 4, 1, 8, 7, 6, 3, 2, 0 };
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
		}

		System.out.println("Before Sort:");
		printArray(array);

		insertionSort(array, 0, array[array.length - 1]);

		System.out.println("After Sort:");
		printArray(array);

	}

	private static void insertionSort(int[] array, int initialIndex, int lastIndex) {
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int j = i - 1;
			while (j >= 0 && current < array[j]) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = current;
		}
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
