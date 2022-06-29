package dataStructure.com;

import java.util.LinkedList;
import java.util.Stack;

public class CheckArrayAndLinkedList {

	public static void main(String[] args) {
   int[] arr=new int[10];
   arr[0]=1;
   arr[1]=2;
   System.out.println("---------------------------");
   
   LinkedList<Integer> list =new LinkedList<Integer>();
   list.add(1);
   list.add(2);
   
   System.out.println(list);
   
   String str="hello";
   Stack<Character> ch=new Stack<>();
   for(int i=0;i<str.length();i++) {
	   ch.push(str.charAt(i));
   }
   for(int i=ch.size();i>=0;i--) {
	   System.out.println(ch.pop());
   }
   
   
   
   
   
   
   
	}

}
