package dataStructure.com.searching;

import java.util.Arrays;

public class BS {

	public static void main(String[] args) {
		int[] arr = { 5, 1, 4, 3, 2,2 };
		qicksort(arr,0, arr.length - 1);
		System.out.println(binSear(arr, 0, arr.length - 1, 2));;
	}

private static void qicksort(int[] arr, int start, int end) {
		int leftPivot=start;
		int rightPivot=end;
		
		
		
	}

//1 2 3 4 5
	private static int binSear(int[] arr, int firstInd, int lastInd,int key) {
		int mid=(firstInd+lastInd)/2;
      	while(firstInd<=lastInd) {
      		if(arr[mid]==key)
      			return mid;
      		else if(arr[mid]<key)
      			firstInd=mid+1;  // set first index to next to mid
      		else
      			lastInd=mid -1; //set last indext to before mid 
      	  mid=(firstInd+lastInd)/2;
      	}
		return mid;
	}

}
