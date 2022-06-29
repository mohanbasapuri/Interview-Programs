package test.com;

import java.util.LinkedList;

public class LinkedListTestCase {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(5);
		list.add(2);
		list.add(3);
		list.add(2);
		System.out.println("Added:" + list);
		
		list.add(1, 2);
		System.out.println("Added new :" + list);
		
		list.addFirst(6);
		System.out.println("Added initially :" + list);
		
		list.addLast(9);
		System.out.println("Added lastly :" + list);
		
		System.out.println("Contains :" + list.contains(5));
		
		list.descendingIterator().forEachRemaining(x->System.out.println(x));
		
		System.out.println("First Ele :" + list.getFirst());
		System.out.println("Last Ele :" + list.getLast());
		
		System.out.println("index of 2 Ele :" +list.indexOf(2));
		System.out.println("lastIndexOf 2  Ele :" +list.lastIndexOf(2));
		
		list.set(2, 8);
		System.out.println("Modified: "+list);
		
		list.remove(3);
		System.out.println("After removed index 3: "+list);
		
		list.remove();
		System.out.println("After remove():"+list);

	}

}
