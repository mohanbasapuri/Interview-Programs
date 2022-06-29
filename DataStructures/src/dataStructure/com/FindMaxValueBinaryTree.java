package dataStructure.com;

public class FindMaxValueBinaryTree {

	public static int findMax(T_Node root) {
		if (root == null)
			return Integer.MIN_VALUE;

		int res = root.data;
		int left = findMax(root.left);
		int right = findMax(root.right);

		if (left > res)
			res = left;
		if (right > res)
			res = right;
		return res;

	}

	public static void main(String[] args) {

		BT bt = new BT();
		bt.createBT();

		System.out.println(FindMaxValueBinaryTree.findMax(bt.root));
	}

}

class T_Node {
	int data;
	T_Node left;
	T_Node right;

	T_Node(int data) {
		this.data = data;
	}
}

class BT {
	T_Node root;

	public void createBT() {
		T_Node first = new T_Node(1);
		T_Node second = new T_Node(2);
		T_Node third = new T_Node(3);
		T_Node forth = new T_Node(4);
		T_Node fifth = new T_Node(5);

		root = first;
		first.left = second;
		first.right = third;

		second.left = forth;
		second.right = fifth;

	}
}
