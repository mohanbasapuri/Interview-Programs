package dataStructure.com.sorting;

public class QuickSort {
	/*
	 * Insertion Sort: Compare two numbers , should be index[1] in temp variable; if
	 * its bigger value then swap it;
	 */

	public static void main(String[] args) {

		int[] array = { 4, 1, 8, 7, 6, 3, 2, 9 };
		System.out.println("Before Sort:");
		printArray(array);

		quickSort(array, 0, array.length - 1);

		System.out.println("After Sort:");
		printArray(array);

	}

	private static void quickSort(int[] array, int initialIndex, int lastIndex) {

		if (initialIndex >= lastIndex)
			return;
		int pivot = array[lastIndex];
		int leftPointer = initialIndex;
		int rightPointer = lastIndex;
		// looping will be done until both pointers will be same
		while (leftPointer < rightPointer) {
			/*
			 * this while loop continuously left side to right side values from array until
			 * the value it finds greater than pivot
			 */
			while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}

			/*
			 * this while loop continuously right side to left side values from array until
			 * the value it finds lesser than pivot
			 */
			while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}
			swap(array, leftPointer, rightPointer);
		}
		/**
		 * Once leftPtr and rightPtr are same/ collision swap the leftPtr and pivot
		 */
		swap(array, leftPointer, lastIndex);
		/**
		 * Calling recursively to sort left and right arrays after partition is done
		 */
		quickSort(array, initialIndex, leftPointer - 1);
		quickSort(array, leftPointer + 1, lastIndex);
	}

	private static void swap(int[] array, int leftptr, int rhtptr) {
		int temp = array[leftptr];
		array[leftptr] = array[rhtptr];
		array[rhtptr] = temp;
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
