package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfTwoGive12 {

	public static void main(String[] args) {
    int[] arr= {7,1,5,9,2};
    Arrays.sort(arr);//1 2 5 7 9
    int n=12;int m=n/2;
    int[] leftArr= new int[arr.length-1];int j=0;
    int[] RightArr= new int[arr.length-1];int k=0;
    for(int i=0;i<arr.length;i++) {
    	if(arr[i]<m) {
    		leftArr[j++]=arr[i];
    	}else {
    		RightArr[k++]=arr[i];
    	}
    }
    
 //   List<Integer> left = new ArrayList<>();
    int[] temp= new int[leftArr.length];
    for(int i=0;i<leftArr.length;i++) {
    	if(leftArr[i]!=0) {
    	temp[i]=leftArr[i];
    	System.out.println(temp[i]);}
    }
    System.out.println();
    
	}

}
