package dataStructure.com.ArraysAlgos;

public class KthQuickSelection {
/**
 * Find the Kth Highest element in array
 * @param args
 */
	public static void main(String[] args) {

		int[] a = { 2, 8, 4, 6, 9, 5,7};
		int k = 4;
		System.out.println(quickSelection(a, k, 0, a.length - 1,"SMALL")); 

	}

	private static int quickSelection(int[] a, int k, int lowIndex, int highIndex, String findType) {
		int pivot = a[highIndex];
		int leftPtr = lowIndex;
		int rightPtr = highIndex;
		int bigElementIndex = a.length - k;
		int lowElementIndex = lowIndex + k - 1;

		while (leftPtr < rightPtr) {
			while (a[leftPtr] <= pivot && leftPtr < rightPtr) {
				leftPtr++;
			}
			while (a[rightPtr] >= pivot && leftPtr < rightPtr) {
				rightPtr--;
			}
			swap(a, leftPtr, rightPtr); 
		}
		swap(a, leftPtr, highIndex);//2 4 5 6 7 9 8
		
		
		if (findType.equals("LARGE")) {
			if (bigElementIndex == leftPtr) {
				return a[leftPtr];
			} else if (bigElementIndex < leftPtr + 1) {
				return quickSelection(a, k, lowIndex, leftPtr - 1, findType);
			} else {
				return quickSelection(a, k, leftPtr + 1, highIndex, findType);
			}
		} else {
			if (lowElementIndex == leftPtr) {
				return a[leftPtr];
			} else if (lowElementIndex < leftPtr + 1) {
				return quickSelection(a, k, lowIndex, leftPtr - 1, findType);
			} else {
				return quickSelection(a, k, leftPtr + 1, highIndex, findType);
			}
		}
		
	}

	private static void swap(int[] a, int leftPtr, int rightPtr) {
		int temp = a[leftPtr];
		a[leftPtr] = a[rightPtr];
		a[rightPtr] = temp;
	}
}
