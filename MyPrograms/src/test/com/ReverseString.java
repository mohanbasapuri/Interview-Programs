package test.com;

import java.util.Scanner;

public class ReverseString {

 public static String reverse(String str) {
	char[] chars = str.toCharArray();
	String revStr="";
	for(int i=chars.length-1;i>=0;i--) {
		revStr+=chars[i];
	}
	 return revStr;
 }
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
//		System.out.println("Enter String:");
//		String str=scan.next();
		
	//	String revStr=reverse(str);
	//	System.out.println(revStr);
		
		System.out.println("---------------");
		System.out.println("Enter statement:");
		String str1=scan.nextLine();
		System.out.println(reverseString(str1));;
		
	}
	private static String reverseString(String str1) {
        char[] chars=str1.toCharArray();	
        String reverseState="";
        for(int i=chars.length-1;i>=0;i--) {
        	reverseState+=chars[i];
        }
        
        return reverseState;
	}
}
