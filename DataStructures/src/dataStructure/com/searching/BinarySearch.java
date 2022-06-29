package dataStructure.com.searching;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 4, 9, 3, 10, 25, 19 };
		Arrays.sort(arr);
		int first = 0, last = arr.length - 1;
		int res = binarySearch(arr, first, last, 25);
		System.out.println(res);
	}

	private static int binarySearch(int[] arr, int first, int last, int key) {
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}

		return 0;
	}
}
