package dataStructure.com.ArraysAlgos;

public class KadenLargestSumOfSubArray {

	public static void main(String[] args) {
		int[] A = { -1, 5, -2, 3, -3, -1 };

		System.out.println(largestSum(A));

	}

	private static int largestSum(int[] A) {
		int max_until_now = A[0]; //4 
		int new_sum = 0;

		for (int i = 1; i < A.length; i++) {
			new_sum = new_sum + A[i];
			if (new_sum > max_until_now) 
				max_until_now = new_sum;
			else if (new_sum < 0) {
				new_sum = 0;
			}
		}

		return max_until_now;

	}
}
