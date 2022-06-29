package dataStructure.com;

import java.util.Arrays;
import java.util.LinkedList;

public class AddTwoNumbers {

	public static void main(String[] args) {
		LinkedList<Integer> list1=new LinkedList<>(Arrays.asList(2,3,5));
		LinkedList<Integer> list2=new LinkedList<>(Arrays.asList(2,3,9));
		
		for(int i=0;i<list1.size();i++) {
			ListNode l1 = new ListNode(list1.get(i));
			ListNode l2 = new ListNode(list2.get(i));
			ListNode res = addTwoNumbers(l1, l2);
			System.out.println(res.val);
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		if (carry > 0) {
			curr.next = new ListNode(carry);
		}
		return dummyHead.next;
	}
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

 
