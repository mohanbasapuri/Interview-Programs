package test.com;

import java.util.*;

class ArrayIntersection {

	// Function to return the count of the number of elements in
	// the intersection of two arrays.

	public static void main(String[] args) {
		int[] a = { 89, 24, 75, 11, 23 };
		int[] b = { 89, 2, 3 };
		long startTime = System.nanoTime();
		System.out.println(NumberofElementsInIntersection(a, b, 5, 3));
		long endTime = System.nanoTime();

		long duration = (endTime - startTime);
		System.out.println("Duration: " + duration);
	}

	public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
		ArrayList<Integer> list1 = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			list1.add(a[i]);
		}
		ArrayList<Integer> list2 = new ArrayList<>();
		for (int j = 0; j < b.length; j++) {
			list2.add(b[j]);
		}
		Set<Integer> s1 = new HashSet<Integer>(list1);
		Set<Integer> s2 = new HashSet<Integer>(list2);
		s1.retainAll(s2);

		return s1.size();

	}

}
