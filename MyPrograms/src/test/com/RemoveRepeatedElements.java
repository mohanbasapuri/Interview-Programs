package test.com;

import java.util.*;

public class RemoveRepeatedElements {

	public static void main(String[] args) {
		removeDuplicatesFromArray();
	}

	private static void removeDuplicatesFromArray() {
		removeDupInt();
		removeDupStr();
		removeDupChar();
	}

	private static void removeDupChar() {
		String str="asdfgds";
		Set<Character> set = new HashSet<>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				set.add(str.charAt(i));
			}
		}
		set.forEach(System.out::println);

	}

	private static void removeDupStr() {
		String[] arr = { "hawa", "gava", "bava", "hawa", "gava" };
		Set<String> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		set.forEach(System.out::println);
	}

	private static void removeDupInt() {
		int[] arr = { 1, 1, 5, 7,8, 3, 2 ,0,0};
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		set.forEach(System.out::println);
	}

}
