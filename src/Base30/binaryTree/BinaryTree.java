package binaryTree;

import java.util.ArrayList;

public class BinaryTree {
	private static ArrayList<Integer> treaB = new ArrayList<Integer>();
	private Node head = new Node();
	private Node right = new Node();
	private Node left = new Node();
	private static BinaryTree tree = new BinaryTree();

	public static void main(String[] args) {
		tree.launch();
	}

	public void launch() {
		tree.addSomeBinaryTree();
		//tree.
	}

	public void findhead() {
		for (int i = 0; i < treaB.size(); i++) {
			if (treaB.size() % 2 != 0) {
				head.setHead((treaB.size() - 1) / 2);
			} else {
				head.setHead((treaB.size() / 2));
			}
		}
		System.out.println(treaB);
		System.out.println("Голова равна поз:" + head.getHead());

	}

	public void addSomeBinaryTree() {
		for (int i = 0; i < 13; i++) {
			treaB.add(i++);
		}
		tree.findhead();
		for (int i = 0; i < treaB.size(); i++) {
			if (treaB.get(i) > head.getHead()) {
				right.setRight(treaB.get(i));
				System.out.println(right.getRight());
			} else {
				left.setLeft(treaB.get(i));
				System.out.println(left.getLeft());
			}
		}
	}
	
	

	public class Node {
		private int head;
		private int left;
		private int right;

		public int getHead() {
			return head;
		}

		public void setHead(int head1) {
			head = head1;
		}

		public int getLeft() {
			return left;
		}

		public void setLeft(int left1) {
			left = left1;
		}

		public int getRight() {
			return right;
		}

		public void setRight(int right) {
			this.right = right;

		}

	}
}
