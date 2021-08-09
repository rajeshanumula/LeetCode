package com.practice;

public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
		TreeNode right=new TreeNode();
		TreeNode left=new TreeNode();
		if(root==null) return null;
		else {
			left=invertTree(root.left);
			right=invertTree(root.right);
			TreeNode temp=left;
			left=right;
			right=temp;
		}
		return new TreeNode(root.val,left,right);
	}

	public static void main(String[] args) {
		InvertBinaryTree inv=new InvertBinaryTree();
		TreeNode root1=new TreeNode(1);
		TreeNode root2=new TreeNode(2);
		TreeNode root3=new TreeNode(3,null,root2);
		TreeNode root4=new TreeNode(4);
		TreeNode root5=new TreeNode(5);
		TreeNode root6=new TreeNode(6,root4,root5);
		TreeNode root7=new TreeNode(7,root3,root6);
		inv.invertTree(root3);
	}

}
