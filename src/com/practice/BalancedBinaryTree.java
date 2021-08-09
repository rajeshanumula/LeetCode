package com.practice;

public class BalancedBinaryTree {
	boolean ret=true;
	public boolean isBalanced(TreeNode root) {
		mytree(root);
		return ret;
	}

	public int mytree(TreeNode root) {
		if(root==null) {
			return 0;
		}
		int left=0;
		int right=0;
		if (root != null) {
			 left+=mytree(root.left);
			 right+=mytree(root.right);
		}
		if(Math.abs(left-right)>1) {
			ret=false;
		}
		return Math.max(left, right)+1;
	}

	public static void main(String[] args) {
		BalancedBinaryTree tree = new BalancedBinaryTree();
		TreeNode root0=new TreeNode(7);
		TreeNode root1 = new TreeNode(15,root0,null);
		TreeNode root2 = new TreeNode(7);
		TreeNode root3 = new TreeNode(20, root1, root2);
		TreeNode root4 = new TreeNode(9);
		TreeNode root6 = new TreeNode(3, root4, root3);
		tree.isBalanced(root6);
	}

}
