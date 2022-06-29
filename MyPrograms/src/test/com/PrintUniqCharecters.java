package test.com;

import java.util.Stack;

public class PrintUniqCharecters {

	public static void main(String[] args) {
     String str="adfsaaedfgdf";
//     char[] list=str.toCharArray();
//     Arrays.sort(list);
     Stack ss=new Stack();
     for(int i=0;i<str.length();i++) {
    	 if(str.charAt(i)!=' ' && !ss.contains(str.charAt(i))) {	
    		 ss.push(str.charAt(i));
    		 System.out.println(str.charAt(i));
    	 }
    	
     }
	}

}
