package com.practice;

public class MinimumDepthBinaryTree {
	public int minDepth(TreeNode root) {
		int left=0;
		int right=0;
		if(root==null) return 0;
		else {
			left=minDepth(root.left);
			right=minDepth(root.right);
		}
		return Math.abs(left-right)==Math.max(left, right)?Math.max(left, right)+1:Math.min(left, right)+1;
	}
	public static void main(String[] args) {
		MinimumDepthBinaryTree tree=new MinimumDepthBinaryTree();
		TreeNode root1=new TreeNode(2);
		TreeNode root2=new TreeNode(3);
		TreeNode root3=new TreeNode(1,root1,root2);
		TreeNode root4=new TreeNode(2);
		TreeNode root5=new TreeNode(5,root4,root3);		
		tree.minDepth(root5);
	}

}
