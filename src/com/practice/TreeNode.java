package com.practice;

//Definition for a binary tree node. 
public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode() {
	}

	public TreeNode(int val) {
		this.val = val;
	}

	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}


//TreeNode root1=new TreeNode(1);
//TreeNode root2=new TreeNode(2);
//TreeNode root3=new TreeNode(3,root1,root2);
//TreeNode root4=new TreeNode(4);
//TreeNode root5=new TreeNode(5);
//TreeNode root6=new TreeNode(6,root4,root5);
//TreeNode root7=new TreeNode(7,root3,root6);
