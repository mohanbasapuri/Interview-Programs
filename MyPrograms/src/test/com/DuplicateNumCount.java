package test.com;

public class DuplicateNumCount {

	public static void main(String[] args) {
		int[] A= {1,2,4,2,2,2,4};
		 for (int i = 0; i < A.length; i++) {
	          A[A[i] % A.length]  = A[A[i] % A.length] + A.length;
	        }
		 
		 
	        System.out.println("The repeating elements are : ");
	        for (int i = 0; i < A.length; i++) {
	            if (A[i] >= A.length * 2) {
	                System.out.println(i + " ");
	            }
	        }	}
}
