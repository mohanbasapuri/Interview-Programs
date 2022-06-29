package test.com;

class Node {

	Node next;
	int data;

	public Node(int data) {
		this.data = data;
	}
}

class LinkedList {
	Node head;

	public void append(int data) {
		if (head == null) {
			head = new Node(data);
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
	}
}

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.append(1);
		list.append(2);
		list.append(3);
		

	}
}