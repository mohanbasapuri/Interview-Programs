package dataStructure.com;

import java.util.*;

public class Binary_Tree_Implement {
	private TreeNode root;

	private class TreeNode {
		private TreeNode left;
		private TreeNode right;
		private int data;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	public void createBinaryTree() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);

		root = first;
		first.left = second;
		first.right = third;

		second.left = fourth;
		second.right = fifth;

	}

	/* Visit Node(1)-->Left(2)-->Right(3) */
	public void recursionPreOrder(TreeNode root) {

		if (root == null)
			return;

		System.out.print(root.data + " ");
		recursionPreOrder(root.left);
		recursionPreOrder(root.right);

	}

	/*
	 * Level 0(Visit Node(1)-->Left(2)-->Right(3))-->
	 * Level 1(Visit Node(2)-->Left(4)-->Right(5),Visit Node(3)-->Left(null)-->Right(null))
	 * And so On....
	 */
	public void levelOrder(TreeNode root) {
		if (root == null)
			return;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			System.out.print(temp.data + " ");

			if (temp.left != null)
				queue.offer(temp.left);
			if (temp.right != null)
				queue.offer(temp.right);
		}
	}

	public void iterativePreOrder(TreeNode root) {
		if (root == null)
			return;

		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);

		while (!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.print(temp.data + " ");

			if (temp.right != null) {
				stack.push(temp.right);
			}
			if (temp.left != null) {
				stack.push(temp.left);
			}
		}
	}

	public static void main(String[] args) {

		Binary_Tree_Implement bt = new Binary_Tree_Implement();
		bt.createBinaryTree();
		System.out.println("PreOrder Using Recursion:");
		bt.recursionPreOrder(bt.root);
		System.out.println();
		System.out.println(" PreOrder Using Iteration:");
		bt.iterativePreOrder(bt.root);
		System.out.println();
		System.out.println(" levelOrder Using Iteration:");
		bt.levelOrder(bt.root);

	}

	

}
