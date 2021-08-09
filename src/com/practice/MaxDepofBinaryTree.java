package com.practice;

public class MaxDepofBinaryTree {
	  public int maxDepth(TreeNode root) {
	        if (root == null) return 0;

	        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxDepofBinaryTree tree=new MaxDepofBinaryTree();
		TreeNode node1=new TreeNode(4);
		TreeNode node2=new TreeNode(5);
		TreeNode node3=new TreeNode(2,node1,node2);
		TreeNode node4=new TreeNode(3);
		TreeNode node5=new TreeNode(1,node3,node4);
		tree.maxDepth(node5);
	}

}
