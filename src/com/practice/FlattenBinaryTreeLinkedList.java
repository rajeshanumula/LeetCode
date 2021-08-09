package com.practice;
import java.util.Stack;

public class FlattenBinaryTreeLinkedList {
	Stack<TreeNode> stack=new Stack<TreeNode>();
	private TreeNode prev = null;
	public void flatten(TreeNode root) {
		if (root == null)
			return;
		flatten(root.right);
		flatten(root.left);
		root.right = prev;
		root.left = null;
		prev = root;
	}

	public static void main(String[] args) {
		FlattenBinaryTreeLinkedList val=new FlattenBinaryTreeLinkedList();
		TreeNode root1=new TreeNode(2);
		TreeNode root2=new TreeNode(11);
		TreeNode root3=new TreeNode(5,root1,root2);
		TreeNode root4=new TreeNode(14);
		TreeNode root5=new TreeNode(20);
		TreeNode root6=new TreeNode(18,root4,root5);
		TreeNode root7=new TreeNode(10,root3,root6);
		val.flatten(root7);
	}

}
