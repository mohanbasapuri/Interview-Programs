package test.com;

import java.util.Arrays;

public class PasswordCompare {

	public static void main(String[] args) {
    
	 String[] str= {"cbcd","cdcb"};
	 char[] firstString = str[0].toCharArray();
		for (int i = 0; i < firstString.length / 2; i++) {
			int j = i + 2;
			swap(firstString[i], firstString[j],firstString,i,j);
			
		}
		if(Arrays.equals(firstString, str[1].toCharArray()))
			System.out.println(1);
		else
			System.out.println(2);
	}

	private static void swap(char a, char b, char[] firstString, int i, int j) {
		char temp = a;
		a = b;
		b = temp;
		firstString[i] = a;
		firstString[j] = b;
	}
		
	}

