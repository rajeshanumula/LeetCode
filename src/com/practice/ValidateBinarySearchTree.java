package com.practice;

public class ValidateBinarySearchTree {
	public boolean isValidBST(TreeNode root) {
		if(root.left==null && root.right==null) return true;
		boolean res =check(root,Long.MIN_VALUE,Long.MAX_VALUE);
		return res;
	}
	public boolean check(TreeNode root, long min, long max) {
		if(root==null) return true;
		if(root.val<=min || root.val>=max) return false;
		boolean result=true;
		result=check(root.left, min, root.val);
		if(result) {
			result=check(root.right, root.val, max);
		}
		return result;
	}
	
	public static void main(String[] args) {
		ValidateBinarySearchTree val=new ValidateBinarySearchTree();
		TreeNode root1=new TreeNode(2);
		TreeNode root2=new TreeNode(11);
		TreeNode root3=new TreeNode(5,root1,root2);
		TreeNode root4=new TreeNode(14);
		TreeNode root5=new TreeNode(20);
		TreeNode root6=new TreeNode(18,root4,root5);
		TreeNode root7=new TreeNode(10,root3,root6);
		val.isValidBST(root7);
	}

}
