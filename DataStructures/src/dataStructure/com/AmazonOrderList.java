package dataStructure.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AmazonOrderList {

	public static void main(String[] args) {
		/*
		 * List<ArrayList<String>> aList = new ArrayList<ArrayList<String>>(5);
		 * ArrayList<String> a1 = new ArrayList<String>(); a1.add("zld 93 12");
		 * aList.add(a1); ArrayList<String> a2 = new ArrayList<String>();
		 * a2.add("fp kindle book"); aList.add(a2); ArrayList<String> a3 = new
		 * ArrayList<String>(); a3.add("10a echo show"); aList.add(a3);
		 * ArrayList<String> a4 = new ArrayList<String>(); a4.add("17g 12 25 6");
		 * aList.add(a4); ArrayList<String> a5 = new ArrayList<String>();
		 * a5.add("125 echo dot second generation"); aList.add(a5);
		 * System.out.println(aList);
		 */
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("zld 93 12");
		a1.add("fp kindle book");
		a1.add("10a echo show");
		a1.add("17g 12 25 6");
		a1.add("ab1 kindle book");
		a1.add("125 echo dot second generation");
		Collections.sort(a1);
		System.out.println(a1);

	}

}
