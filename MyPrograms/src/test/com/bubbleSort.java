package test.com;

import java.util.Scanner;
public class bubbleSort {

	public static void main(String[] args) {

//    Scanner scan=new Scanner(System.in);
//    int N=scan.nextInt();
    
    int[] data=new int[] {1,5,2,4,10,0,-3,-2};
    
	for (int i = 0; i < data.length; i++) {
		for (int j = i + 1; j < data.length; j++) {
			if (data[i] > data[j]) {
				int temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}
	}

	for (int i = 0; i < data.length; i++) {
		System.out.println(data[i]);

	}
				
	}
}
