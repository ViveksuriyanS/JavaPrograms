package com.appito;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeZigZag {
	static TreeNode root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addNode(1);
		addNode(2);
		addNode(3);
		addNode(4);
		addNode(5);
		addNode(6);
		addNode(7);
		print();
		printZigZag();
	}

	private static void printZigZag() {
		TreeNode temp = root;
		Stack<TreeNode> currentLevel = new Stack<TreeNode>();
		Stack<TreeNode> nextLevel = new Stack<TreeNode>();
		boolean leftToRight = true;
		currentLevel.add(temp);
		while (!currentLevel.isEmpty()) {
			TreeNode currNode = currentLevel.pop();
			System.out.println(currNode.data);
			if (leftToRight) {
				if (currNode.left != null) {
					nextLevel.add(currNode.left);
				}
				if (currNode.right != null) {
					nextLevel.add(currNode.right);
				}
			} else {
				if (currNode.right != null) {
					nextLevel.add(currNode.right);
				}
				if (currNode.left != null) {
					nextLevel.add(currNode.left);
				}
			}

			if (currentLevel.isEmpty()) {
				currentLevel.addAll(nextLevel);
				nextLevel.removeAllElements();
				leftToRight = !leftToRight;
			}
		}

	}

	public static void print() {
		TreeNode curr = root;
		Queue<TreeNode> qu = new LinkedList<TreeNode>();
		qu.add(curr);
		while (!qu.isEmpty()) {
			TreeNode tmp = qu.remove();
			System.out.println(tmp.data);
			if (tmp.left != null) {
				qu.add(tmp.left);
			}
			if (tmp.right != null) {
				qu.add(tmp.right);
			}
		}
	}

	public static void addNode(int data) {
		TreeNode newNode = new TreeNode(data);
		if (root == null) {
			root = newNode;
		} else {
			TreeNode currentNode = root;
			Queue<TreeNode> que = new LinkedList<TreeNode>();
			que.add(currentNode);
			while (!que.isEmpty()) {
				TreeNode tmp = que.remove();
				if (tmp.left == null) {
					tmp.left = newNode;
					break;
				} else {
					que.add(tmp.left);
				}
				if (tmp.right == null) {
					tmp.right = newNode;
					break;
				} else {
					que.add(tmp.right);
				}

			}
		}
	}

}

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	TreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}