package test.com;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateStreams {

	public static void main(String[] args) {
    String str="abbsbsc";
    removeDUplicates( str);
	}

	private static void removeDUplicates(String str) {
     		Set<Character> set=new HashSet<>();
     		for(int i=0;i<str.length();i++) {
     			set.add(str.charAt(i));
     		}
     		System.out.println(set.stream().map(n->n.toString()).collect(Collectors.joining("")));;
	}

}
