package dataStructure.com;

public class InsertValueInBinarySearchTree {

	private Tree_Node root;

	private class Tree_Node {
		private Tree_Node left;
		private Tree_Node right;
		private int data;

		public Tree_Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		InsertValueInBinarySearchTree ins = new InsertValueInBinarySearchTree();
		ins.insert(5);
		ins.insert(3);
		ins.insert(4);
		ins.insert(7);
		ins.insert(1);
		recursionInOrder(ins.root);
	}

	private void insert(int value) {
		root = insert(root, value);
	}

	private Tree_Node insert(Tree_Node root, int value) {
		if (root == null) {
			root = new Tree_Node(value);
			return root;
		}

		if (value < root.data)
			root.left = insert(root.left, value);
		else
			root.right = insert(root.right, value);
		return root;

	}

	public static void recursionInOrder(Tree_Node root) {

		if (root == null)
			return;

		recursionInOrder(root.left);
		System.out.print(root.data + " ");
		recursionInOrder(root.right);

	}

}
