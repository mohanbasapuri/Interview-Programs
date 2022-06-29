package dataStructure.com.searching;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 4, 9, 3, 10, 25, 19 };
		System.out.println(linearSearch(arr,10));
	}

	private static boolean linearSearch(int[] arr,int key) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==key) {
					return true;
				}
			}
		}
		return false;
	}

}
