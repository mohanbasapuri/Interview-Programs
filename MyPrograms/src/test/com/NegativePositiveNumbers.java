package test.com;

import java.util.*;

public class NegativePositiveNumbers {

	public static void main(String[] args) {
		int[] arr = { -1, 1, 2, -7, 4, 8, 9, 99, 0, -14, -2, -1, -99, -7, 8 };
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		Stack<Integer> stockNegNumbers = pushNegNumToStack(list);
		separateNegAndPosNumbers(stockNegNumbers, list);
	}

	private static void separateNegAndPosNumbers(Stack<Integer> stockNegNumbers, List<Integer> list) {
		int k = 0;
		while (k < stockNegNumbers.size()) {
			if (list.contains(stockNegNumbers.get(k)))
				list.remove(stockNegNumbers.get(k));
			list.add(stockNegNumbers.get(k));
			k++;
		}
		System.out.println(list);
	}

	private static Stack<Integer> pushNegNumToStack(List<Integer> list) {
		int len = list.size(), i = 0;
		Stack<Integer> stack = new Stack<>();
		while (i < len) {
			if (list.get(i) < 0)
				stack.push(list.get(i));
			len = list.size();
			i++;
		}

		return stack;
	}
}
