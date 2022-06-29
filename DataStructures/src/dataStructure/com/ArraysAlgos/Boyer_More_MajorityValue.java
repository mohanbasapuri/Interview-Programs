package dataStructure.com.ArraysAlgos;

public class Boyer_More_MajorityValue {

	public static void main(String[] args) {

		int[] A = { 1, 1, 4, 3 };

		findMajorityIndex(A);
	}

	private static void findMajorityIndex(int[] A) {
		int ansIndex = 0;
		int count = 1;
		int mid = A.length / 2;

		for (int i = 1; i < A.length; i++) {
			if (A[i] == A[ansIndex])
				count++;
			 else
				count--;

			if (count == 0) {
				ansIndex = i;
				count = 1;
			}
		}

		count = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[ansIndex] == A[i]) {
				count++;
			}
		}
		if (count > mid)
			System.out.println(A[ansIndex]);
		else
			System.out.println("Not found");

	}

}
